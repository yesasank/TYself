package com.tyself.tyself.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyself.tyself.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}