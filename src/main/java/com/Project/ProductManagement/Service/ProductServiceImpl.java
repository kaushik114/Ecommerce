package com.Project.ProductManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.ProductManagement.Model.Products;
import com.Project.ProductManagement.Repocitory.ProductRepo;

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
