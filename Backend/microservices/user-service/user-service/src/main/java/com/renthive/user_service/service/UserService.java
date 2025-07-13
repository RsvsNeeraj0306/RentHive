package com.renthive.user_service.service;

import java.util.List;
import java.util.UUID;

import com.renthive.user_service.entity.User;

public interface UserService {

    User saveUser(User user);
    User getUserById(UUID id);
    User updateUser(UUID id, User user);
    void deleteUser(UUID id);
    List<User> getAllUsers();


    
    
}
