package com.feedback.app.product.controller;

import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.mapper.ProductMapper;
import com.feedback.app.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;
    private ProductMapper productMapper;

    @GetMapping
    public List<ProductDTO> getFiveBestProducts(){
        return productService.getFiveBestProducts()
                .stream().map(p -> productMapper.entityToDTO(p))
                .limit(5)
                .collect(Collectors.toList());
    }
}
