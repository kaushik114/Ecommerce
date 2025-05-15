package com.Project.Ecommerce.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Project.ProductManagement.Model.Products;
import com.Project.ProductManagement.Service.ProductService;

@RestController
@RequestMapping("/admin")
public class ProductControllerAdmin {

    @Autowired
    private ProductService service;

    @PostMapping("/save")
    public ResponseEntity<String> saveProduct(@RequestBody Products product) {
        service.save(product);
        return new ResponseEntity<>("Product saved successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
        service.delete(id);
        return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
    }

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
