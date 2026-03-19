package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.PurchaseOrder;
import com.erp.repository.PurchaseOrderRepository;

@Service
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository repository;

    public List<PurchaseOrder> getAll(){

        return repository.findAll();
    }

    public PurchaseOrder save(PurchaseOrder order){

        return repository.save(order);
    }
}