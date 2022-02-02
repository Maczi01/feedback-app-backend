package com.feedback.app.product.service;

import com.feedback.app.product.dto.ProductDetailsDTO;
import com.feedback.app.product.mapper.ProductMapper;
import com.feedback.app.product.model.Product;
import com.feedback.app.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private ProductRepository productRepository;
    private ProductMapper productMapper;

    public List<ProductDetailsDTO> getBestProducts(int amount) {
        return productRepository.getBestProducts(amount).stream()
                .map(product -> productMapper.toDTO(product))
                .collect(Collectors.toList());
    }

    public ProductDetailsDTO getProductById(Long id) throws ProductNotFoundException {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Can not find product with id: " + id));
        return productMapper.toDTO(product);
    }

    public List<ProductDetailsDTO> getAllProduct() {
        return productRepository.findAll()
                .stream()
                .map(product -> productMapper.toDTO(product))
                .collect(Collectors.toList());
    }

    public ProductDetailsDTO addProduct(ProductDetailsDTO productDTO) {
        Product product = productMapper.toEntity(productDTO);
        Product savedProduct = productRepository.save(product);
        return productMapper.toDTO(savedProduct);
    }
}
