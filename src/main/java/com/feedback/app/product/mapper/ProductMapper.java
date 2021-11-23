package com.feedback.app.product.mapper;

import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO entityToDTO(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .numberOfFeedbacks(product.getFeedbacks().size())
                .averageGrade(product.getAverageGrade())
                .build();
    }




}
