package com.educandoweb.course.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
    
    @Autowired
    private CategoryService CategoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> Categorys = CategoryService.findAll();
        return ResponseEntity.ok().body(Categorys);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = CategoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}