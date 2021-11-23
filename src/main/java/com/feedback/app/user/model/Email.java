package com.feedback.app.user.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "emails")
public class Email {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    public Email(Long id, String email) {
        this.id = id;
        this.email = validate(email);
    }

    private String validate(String email) {
        if(!email.contains("@")){
            throw new IllegalArgumentException();
        }
        return email;
    }
}
