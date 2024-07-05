package com.example.ProductCatalog.controller;

import com.example.ProductCatalog.entity.Product;
import com.example.ProductCatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/catalog")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public String showOptions(Model model){
        return "userInterface";
    }

    @GetMapping("/newProduct")
    public String newProduct(Model model){
        model.addAttribute("product",new Product());
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProduct(Product product,Model model){
        Product addProduct=productService.addProduct(product);
        model.addAttribute("products",productService.displayProduct());
        return "redirect:/catalog/displayProducts";
    }
    @GetMapping("/displayProducts")
    public String displayProduct(Model model) {
        List<Product> display = productService.displayProduct();
        model.addAttribute("products",display);
        return "page";
    }
}
