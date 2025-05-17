package com.cts.eCommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<com.cts.eCommerce.model.Products, Integer> {
    List<com.cts.eCommerce.model.Products> findByProductNameLike(String productName);
}
