package com.feedback.app.product.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private CategoryName name;
    private String description;

}
