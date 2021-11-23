package com.feedback.app.product.controller;

import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.mapper.ProductMapper;
import com.feedback.app.product.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private ProductMapper productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping
    public List<ProductDTO> getBestProducts(int amount){
        return productService.getBestProducts(amount)
                .stream()
                .map(product -> productMapper.entityToDTO(product))
                .collect(Collectors.toList());
    }


}
