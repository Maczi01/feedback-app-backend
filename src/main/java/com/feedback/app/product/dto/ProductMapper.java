package com.feedback.app.product.dto;

import com.feedback.app.feedback.dto.FeedbackMapper;
import com.feedback.app.product.model.Product;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProductMapper {

    private FeedbackMapper feedbackMapper;

    public ProductDTO entityToDTO(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .categories(product.getCategories().stream().map(c -> c.getName().toString()).collect(Collectors.toList()))
                .feedbacks(product.getFeedbacks().stream().map(f -> feedbackMapper.entityToDTO(f)).collect(Collectors.toList()))
                .averageGrade(product.getAverageGrade())
                .build();
    }


}
