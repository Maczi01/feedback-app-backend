package com.feedback.app.user.model;

import com.feedback.app.common.BaseEntity;
import com.feedback.app.feedback.model.Feedback;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    @OneToMany(mappedBy = "user")
    private List<Feedback> feedbacks = new ArrayList<>();



}
