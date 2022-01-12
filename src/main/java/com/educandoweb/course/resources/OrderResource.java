package com.educandoweb.course.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderResource {
    
    @Autowired
    private OrderService OrderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> Orders = OrderService.findAll();
        return ResponseEntity.ok().body(Orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = OrderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}