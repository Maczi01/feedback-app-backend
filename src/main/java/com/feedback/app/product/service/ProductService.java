package com.feedback.app.product.service;

import com.feedback.app.product.model.Product;
import com.feedback.app.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getFiveBestProducts(){
        return productRepository.getFiveBestProducts();
    }

}
