package com.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.erp.entity.Supplier;
import com.erp.service.SupplierService;

@RestController
@RequestMapping("/api/suppliers")
@CrossOrigin("*")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public List<Supplier> getSuppliers(){
        return supplierService.getAllSuppliers();
    }

    @PostMapping
    public Supplier addSupplier(@RequestBody Supplier supplier){
        return supplierService.saveSupplier(supplier);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable Long id){
        supplierService.deleteSupplier(id);
    }
}