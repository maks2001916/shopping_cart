package com.example.shopping_cart.service;

import com.example.shopping_cart.product.Product;
import com.example.shopping_cart.record.ProductReqyest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@Service
public class ProductService {
    private final Map<Integer, Product> products = new HashMap<>();

    public Collection<Product> getAllProducts() {
        return this.products.values();
    }

    public Product addProduct(ProductReqyest productReqyest) {
        if (productReqyest.getName() == null || productReqyest.getPrice() == 0) {
            throw new IllegalArgumentException("неверные значения");
        }
        Product product = new Product(productReqyest.getName(),
                productReqyest.getPrice());

        this.products.put(product.getId(), product);
        return product;
    }
}
