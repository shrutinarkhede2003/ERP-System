package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.Invoice;
import com.erp.repository.InvoiceRepository;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository repository;

    public List<Invoice> getAll(){

        return repository.findAll();
    }

    public Invoice save(Invoice invoice){

        return repository.save(invoice);
    }
}