package com.nouman.SpringEcom.controller;

import com.nouman.SpringEcom.model.Product;
import com.nouman.SpringEcom.service.ProductService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
   private ProductService productService;


    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
}
