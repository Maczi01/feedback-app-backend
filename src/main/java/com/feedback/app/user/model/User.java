package com.feedback.app.user.model;

import com.feedback.app.feedback.model.Feedback;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade=CascadeType.ALL)
    private Email email;
    @OneToMany(mappedBy = "user")
    private List<Feedback> feedbacks = new ArrayList<>();


}
