package com.renthive.user_service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renthive.user_service.entity.User;

public interface UserRepository extends JpaRepository<User,UUID> {

    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
}
