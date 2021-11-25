package com.feedback.app.user.model;

import com.feedback.app.user.service.WrongEmailException;
import lombok.*;

import javax.persistence.*;

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
