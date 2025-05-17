package com.cts.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eCommerce.model.Products;
import com.cts.eCommerce.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repo;

    @Override
    public List<Products> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public List<Products> findByProductNameLike(String name) {
        return repo.findByProductNameLike(name);
    }

    @Override
    public void save(Products product) {
        repo.save(product);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
