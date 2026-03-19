package com.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.erp.dto.*;
import com.erp.entity.User;
import com.erp.security.JwtUtil;
import com.erp.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest request){

        User user = authService.findByUsername(request.getUsername());

        if(user != null && user.getPassword().equals(request.getPassword())){

            String token = jwtUtil.generateToken(user.getUsername());

            return new JwtResponse(token);
        }

        throw new RuntimeException("Invalid credentials");
    }
}