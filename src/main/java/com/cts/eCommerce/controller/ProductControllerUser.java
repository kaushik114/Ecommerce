package com.cts.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.eCommerce.model.Products;
import com.cts.eCommerce.service.ProductService;

@RestController
@RequestMapping("/user")
public class ProductControllerUser {

    @Autowired
    private ProductService service;

    @GetMapping("/home")
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> products = service.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/search/{pattern}")
    public ResponseEntity<List<Products>> findByProductNameLike(@PathVariable String pattern) {
        List<Products> products = service.findByProductNameLike(pattern + "%");
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
