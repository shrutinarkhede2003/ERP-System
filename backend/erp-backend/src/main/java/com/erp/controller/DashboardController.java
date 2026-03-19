package com.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.erp.repository.*;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin("*")
public class DashboardController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SalesOrderRepository salesRepository;

    @Autowired
    private PurchaseOrderRepository purchaseRepository;

    @GetMapping("/summary")
    public Object getSummary(){

        long products = productRepository.count();
        long sales = salesRepository.count();
        long purchases = purchaseRepository.count();

        return new Object(){
            public long totalProducts = products;
            public long totalSalesOrders = sales;
            public long totalPurchaseOrders = purchases;
        };
    }
}