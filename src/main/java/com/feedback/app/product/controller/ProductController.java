package com.feedback.app.product.controller;

import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.dto.ProductMapper;
import com.feedback.app.product.service.ProductService;
import com.feedback.app.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    public List<ProductDTO> getTenBestProducts(){
        return productService.getTenBestProducts()
                .stream().map(p -> productMapper.entityToDTO(p))
                .collect(Collectors.toList());
    }
}
