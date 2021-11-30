package com.feedback.app.product.mapper;

import com.feedback.app.common.Mapper;
import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.dto.ProductDetailsDTO;
import com.feedback.app.product.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ProductMapper implements Mapper<ProductDTO, Product> {
    @Override
    public Product toEntity(ProductDTO product) {
                return Product.builder()
                .id(product.getId())
                .averageGrade(0.0)
                .name(product.getName())
                .feedbacks(new ArrayList<>())
                .build();
    }

    @Override
    public ProductDTO toDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .numberOfFeedbacks(product.getFeedbacks().size())
                .averageGrade(product.getAverageGrade())
                .build();
    }

}
