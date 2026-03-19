
package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.GRN;
import com.erp.repository.GRNRepository;

@Service
public class GRNService {

    @Autowired
    private GRNRepository repository;

    public List<GRN> getAll(){

        return repository.findAll();
    }

    public GRN save(GRN grn){

        return repository.save(grn);
    }
}