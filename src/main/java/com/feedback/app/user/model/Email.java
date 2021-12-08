package com.feedback.app.user.model;

import com.feedback.app.user.service.WrongEmailFormatException;
import lombok.Builder;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "emails")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    public Email(String email) throws WrongEmailFormatException {
        this.email = validate(email);
    }

    private String validate(String email) throws WrongEmailFormatException {
        if(!email.contains("@")){
            throw new WrongEmailFormatException("Incorrect email");
        }
        return email;
    }
}
