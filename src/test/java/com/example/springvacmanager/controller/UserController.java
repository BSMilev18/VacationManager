package com.example.springvacmanager.controller;

import ch.qos.logback.core.model.Model;
import com.example.springvacmanager.model.User;
import com.example.springvacmanager.repository.VacManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private VacManager userRepo;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userRepo.saveUser(user);
        return "New user is added";
    }
}
