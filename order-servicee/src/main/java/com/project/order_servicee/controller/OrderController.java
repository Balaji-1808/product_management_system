package com.project.order_servicee.controller;

import com.project.order_servicee.model.OrderModel;
import com.project.order_servicee.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public ResponseEntity<OrderModel> placeOrder(@RequestBody OrderModel orderModel) {
        return ResponseEntity.ok(orderService.save(orderModel));
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderModel>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }
}
