package com.example.shopping_cart.service;

import com.example.shopping_cart.product.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class ProductService {
    private final Map<Integer, Product> products = new HashMap<>();

    public Collection<Product> getAllProducts() {
        return this.products.values();
    }
}
