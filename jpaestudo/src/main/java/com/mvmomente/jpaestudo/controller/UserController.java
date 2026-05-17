package com.mvmomente.jpaestudo.controller;

import com.mvmomente.jpaestudo.dto.RegisterDto;
import com.mvmomente.jpaestudo.entity.User;
import com.mvmomente.jpaestudo.services.UserServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServices service;

    public UserController(UserServices service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> showUser(){
        return ResponseEntity.ok(service.showAllUser());
    }

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody RegisterDto dto) {
        //User user = service.createUser(dto);
        return ResponseEntity.ok(service.createUser(dto));
    }
}
