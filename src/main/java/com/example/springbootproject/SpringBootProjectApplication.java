package com.example.springbootproject;

import com.example.springbootproject.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProjectApplication.class, args);
        Customer c=new Customer();
        c.setId(1);
        c.setName("Baran");
        c.setNumber(022102);
        c.toString();
    }
}