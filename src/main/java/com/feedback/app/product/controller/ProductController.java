package com.feedback.app.product.controller;

import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.mapper.ProductMapper;
import com.feedback.app.product.model.Product;
import com.feedback.app.product.service.ProductNotFoundException;
import com.feedback.app.product.service.ProductService;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService productService;
    private ProductMapper productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping("{id}")
    public ProductDTO getProductById(@PathVariable Long id) throws ProductNotFoundException {
        return productMapper.entityToDTO(productService.getProductById(id));
    }

    @GetMapping("/best")
    public List<ProductDTO> getBestProducts(@RequestParam(defaultValue = "5") int amount){
        return productService.getBestProducts(amount)
                .stream()
                .map(product -> productMapper.entityToDTO(product))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO){
        Product product = productMapper.toEntity(productDTO);
        Product savedProduct = productService.addProduct(product);
        System.out.println(savedProduct);
        return productMapper.entityToDTO(savedProduct);
    }
}
