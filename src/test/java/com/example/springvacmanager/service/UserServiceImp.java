package com.example.springvacmanager.service;

import com.example.springvacmanager.model.User;
import com.example.springvacmanager.repository.VacManager;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService{

    @Autowired
    private VacManager userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
