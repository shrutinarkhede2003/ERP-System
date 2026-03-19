package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.Supplier;
import com.erp.repository.SupplierRepository;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }

    public Supplier saveSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

    public void deleteSupplier(Long id){
        supplierRepository.deleteById(id);
    }
}