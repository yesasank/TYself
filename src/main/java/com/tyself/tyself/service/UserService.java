package com.tyself.tyself.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tyself.tyself.entity.User;
import com.tyself.tyself.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}