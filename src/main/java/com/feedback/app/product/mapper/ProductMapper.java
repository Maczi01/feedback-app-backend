package com.feedback.app.product.mapper;

import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.model.Category;
import com.feedback.app.product.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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


    public Product toEntity(ProductDTO productDTO) {
        return Product.builder()
                .id(productDTO.getId())
                .averageGrade(0.0)
                .name(productDTO.getName())
                .feedbacks(new ArrayList<>())
                .build();
    }
}
