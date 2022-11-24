package com.example.shopping_cart.controller;

import com.example.shopping_cart.product.Product;
import com.example.shopping_cart.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/store/order/get")
    public Collection<Product> getAllProduct() {
        return this.productService.getAllProducts();
    }

    
}
