package com.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.User;
import com.erp.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {

        return userRepository.findByUsername(username).orElse(null);
    }

}