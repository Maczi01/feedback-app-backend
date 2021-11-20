package com.feedback.app.product.model;

import com.feedback.app.feedback.model.Feedback;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private List<Feedback> feedbacks = new ArrayList<>();

    private Double averageGrade;
}
