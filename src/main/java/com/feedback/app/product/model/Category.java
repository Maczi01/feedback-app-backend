package com.feedback.app.product.model;

import com.feedback.app.common.BaseEntity;
import com.feedback.app.product.model.CategoryName;
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
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private CategoryName name;
    private String description;
//    @OneToMany
//    @JoinColumn(name = "category_id")
//    private List<Product> productList = new ArrayList<>();

}
