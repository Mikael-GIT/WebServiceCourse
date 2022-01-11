package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1, "Mikael", "mikaeltava29@hotmail.com", "21971978127", "123");
        return ResponseEntity.ok().body(user);
    }
}