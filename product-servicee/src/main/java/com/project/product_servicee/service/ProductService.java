package com.project.product_servicee.service;

import com.project.product_servicee.model.Product;
import com.project.product_servicee.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepo.findById(id);
    }

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }
}
