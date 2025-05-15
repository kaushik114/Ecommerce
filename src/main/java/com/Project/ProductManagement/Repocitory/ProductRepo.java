package com.Project.ProductManagement.Repocitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<com.Project.ProductManagement.Model.Products, Integer> {
    List<com.Project.ProductManagement.Model.Products> findByProductNameLike(String productName);
}
