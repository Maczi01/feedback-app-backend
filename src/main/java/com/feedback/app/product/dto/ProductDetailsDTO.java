package com.feedback.app.product.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class ProductDetailsDTO {

    private Long id;
    private String name;
    private Integer numberOfFeedbacks;
    private Double averageGrade;
    private List<String> categories;

}
