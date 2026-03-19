package com.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.erp.entity.SalesOrder;
import com.erp.service.SalesOrderService;

@RestController
@RequestMapping("/api/sales-orders")
@CrossOrigin("*")
public class SalesOrderController {

    @Autowired
    private SalesOrderService service;

    @GetMapping
    public List<SalesOrder> getOrders(){
        return service.getAllOrders();
    }

    @PostMapping
    public SalesOrder createOrder(@RequestBody SalesOrder order){
        return service.saveOrder(order);
    }
}