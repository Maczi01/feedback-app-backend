package com.feedback.app.user.model;

import com.feedback.app.user.service.WrongEmailException;
import lombok.Builder;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emails")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    public Email(String email) throws WrongEmailException {
        this.email = validate(email);
    }

    private String validate(String email) throws WrongEmailException {
        if(!email.contains("@")){
            throw new WrongEmailException("Incorrect email");
        }
        return email;
    }
}
