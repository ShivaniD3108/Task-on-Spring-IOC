package com.example.ProductCatalog.service;

import com.example.ProductCatalog.entity.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);

    public List<Product> displayProduct();

}
