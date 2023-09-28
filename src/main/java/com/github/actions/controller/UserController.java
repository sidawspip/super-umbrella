package com.github.actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String msg(){
        return "Hello,Github Actions is working!!!";
    }
    
}
