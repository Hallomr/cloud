package com.example.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {
    @GetMapping("/test")
    public void business(){
        System.out.println("========= business =========");
    }
}
