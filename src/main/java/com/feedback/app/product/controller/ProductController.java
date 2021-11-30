package com.feedback.app.product.controller;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.mapper.FeedbackMapper;
import com.feedback.app.feedback.service.FeedbackService;
import com.feedback.app.product.dto.ProductDTO;
import com.feedback.app.product.mapper.ProductMapper;
import com.feedback.app.product.model.Product;
import com.feedback.app.product.service.ProductNotFoundException;
import com.feedback.app.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService productService;
    private FeedbackService feedbackService;
    private ProductMapper productMapper;
    private FeedbackMapper feedbackMapper;

    public ProductController(ProductService productService, FeedbackService feedbackService, ProductMapper productMapper, FeedbackMapper feedbackMapper) {
        this.productService = productService;
        this.feedbackService = feedbackService;
        this.productMapper = productMapper;
        this.feedbackMapper = feedbackMapper;
    }

    @GetMapping("{id}")
    public ProductDTO getProductById(@PathVariable Long id) throws ProductNotFoundException {
        ProductDTO productDTO = productMapper.toDTO(productService.getProductById(id));
        List<FeedbackDTO> feedbacks = feedbackService.getFeedbackByProductId(id).stream()
                .map(feedback -> feedbackMapper.toDTO(feedback))
                .collect(Collectors.toList());
//        productDTO.setFeedbacks(feedbacks);
        return productDTO;
    }

    @GetMapping
    public List<ProductDTO> getProducts() {
        return productService.getAllProduct()
                .stream()
                .map(product -> productMapper.toDTO(product))
                .collect(Collectors.toList());
    }

    @GetMapping("/best")
    public List<ProductDTO> getBestProducts(@RequestParam(defaultValue = "5") int amount) {
        return productService.getBestProducts(amount)
                .stream()
                .map(product -> productMapper.toDTO(product))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO) {
        Product product = productMapper.toEntity(productDTO);
        Product savedProduct = productService.addProduct(product);
        System.out.println(savedProduct);
        return productMapper.toDTO(savedProduct);
    }
}
