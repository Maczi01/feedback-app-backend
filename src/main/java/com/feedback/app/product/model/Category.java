package com.feedback.app.product.model;

import com.feedback.app.common.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {

    private CategoryName name;
    private String description;


}
