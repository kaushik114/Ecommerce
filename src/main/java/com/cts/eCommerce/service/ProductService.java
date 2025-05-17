package com.cts.eCommerce.service;

import java.util.List;

import com.cts.eCommerce.model.Products;

public interface ProductService {
    List<Products> getAllProducts();
    List<Products> findByProductNameLike(String name);
    void save(Products product);
    void delete(Integer id);
}
