package com.college.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.college.enities.User;
import com.college.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public User getUserProfile(@PathVariable String username) {
        return userService.findByUsername(username).orElse(null);
    }
}

