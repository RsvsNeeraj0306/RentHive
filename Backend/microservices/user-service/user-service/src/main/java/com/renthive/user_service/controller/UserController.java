package com.renthive.user_service.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renthive.user_service.entity.User;
import com.renthive.user_service.serviceImpl.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;


    @PostMapping
    public User createUser(@RequestBody User user){
        return userServiceImpl.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable UUID id) {
        return userServiceImpl.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }
    
}
