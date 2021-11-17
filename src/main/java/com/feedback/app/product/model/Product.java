package com.feedback.app.product.model;

import com.feedback.app.common.BaseEntity;
import com.feedback.app.feedback.model.Feedback;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

    private String name;

    @OneToMany
    @JoinColumn(name = "product_id")
    List<Category> categoryList = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<Feedback> feedbacks = new ArrayList<>();

    private Double grade;




}
