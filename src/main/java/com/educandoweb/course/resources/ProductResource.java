package com.educandoweb.course.resources;

import java.util.List;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {
    
    @Autowired
    private ProductService ProductService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> Products = ProductService.findAll();
        return ResponseEntity.ok().body(Products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = ProductService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}