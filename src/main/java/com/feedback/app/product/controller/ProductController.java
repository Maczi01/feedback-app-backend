package com.feedback.app.product.controller;

import com.feedback.app.product.dto.ProductDetailsDTO;
import com.feedback.app.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDetailsDTO> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductDetailsDTO>> getProducts() {
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @GetMapping("/best")
    public ResponseEntity<List<ProductDetailsDTO>> getBestProducts(@RequestParam(defaultValue = "5") int amount) {
        return ResponseEntity.ok(productService.getBestProducts(amount));
    }

    @PostMapping
    public ResponseEntity<ProductDetailsDTO> addProduct(@RequestBody ProductDetailsDTO productDTO) {
        ProductDetailsDTO createdProduct = productService.addProduct(productDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdProduct.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdProduct);
    }
}
