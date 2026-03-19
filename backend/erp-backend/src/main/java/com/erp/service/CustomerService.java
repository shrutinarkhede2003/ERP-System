package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.Customer;
import com.erp.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers(){

        return repository.findAll();
    }

    public Customer saveCustomer(Customer customer){

        return repository.save(customer);
    }

}