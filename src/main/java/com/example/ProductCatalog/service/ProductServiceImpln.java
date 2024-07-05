package com.example.ProductCatalog.service;

import com.example.ProductCatalog.entity.Product;
import com.example.ProductCatalog.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpln implements ProductService{
    @Autowired
    ProductRepo productRepo;
    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    @Override
    public List<Product> displayProduct() {
        return productRepo.findAll();
    }
}
