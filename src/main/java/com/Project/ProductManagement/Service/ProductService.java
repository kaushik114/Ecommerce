package com.Project.ProductManagement.Service;

import java.util.List;

import com.Project.ProductManagement.Model.Products;

public interface ProductService {
    List<Products> getAllProducts();
    List<Products> findByProductNameLike(String name);
    void save(Products product);
    void delete(Integer id);
}
