package com.feedback.app.product.controller;

import com.feedback.app.product.model.Product;
import com.feedback.app.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;

    public List<Product> getTenBestProducts(){
        return productService.getTenBestProducts();
    }
}
