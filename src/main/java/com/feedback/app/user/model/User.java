package com.feedback.app.user.model;

import com.feedback.app.common.BaseEntity;
import com.feedback.app.feedback.model.Feedback;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {


    @OneToMany(mappedBy = "user")
    private List<Feedback> feedbacks = new ArrayList<>();



}
