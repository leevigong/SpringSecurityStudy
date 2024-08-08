package com.example.SpringSecurityStudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping
    public String index() {
        return "Hello World";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "Login Page";
    }

    @GetMapping("/home")
    public String home() {
        return "Home";
    }

}
