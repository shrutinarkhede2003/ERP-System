package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.SalesOrder;
import com.erp.repository.SalesOrderRepository;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderRepository repository;

    public List<SalesOrder> getAllOrders(){
        return repository.findAll();
    }

    public SalesOrder saveOrder(SalesOrder order){
        return repository.save(order);
    }
}