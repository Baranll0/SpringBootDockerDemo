package com.example.springbootproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/all")
    public String home() {
        return "Customer Pasadlkasfd!";
    }
}
