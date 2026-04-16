package com.project.product_servicee.controller;

import com.project.product_servicee.model.Product;
import com.project.product_servicee.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/all")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductServiceById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping("/postproduct")
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping("/update")
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
