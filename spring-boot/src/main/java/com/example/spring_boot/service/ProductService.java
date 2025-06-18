package com.example.spring_boot.service;

import com.example.spring_boot.entity.Product;
import com.example.spring_boot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    
    private final ProductRepository productRepository;
    
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    /**
     * Get all products from the database
     * @return List of all products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    /**
     * Get a product by its ID
     * @param id The product ID
     * @return Optional containing the product if found
     */
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
} 