package com.mouritech.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
