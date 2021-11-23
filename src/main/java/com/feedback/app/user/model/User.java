package com.feedback.app.user.model;

import com.feedback.app.feedback.model.Feedback;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Builder
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne
    private Email email;
    @OneToMany(mappedBy = "user")
    private List<Feedback> feedbacks = new ArrayList<>();


}
