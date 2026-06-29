package org.example.md03_session01_bt3.service;

import org.example.md03_session01_bt3.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private List<Product> products = List.of(
            new Product(1, "Product 1", 10.0),
            new Product(2, "Product 2", 20.0),
            new Product(3, "Product 3", 30.0)
    );

    public List<Product> getAllProducts() {
        return products;
    }
}
