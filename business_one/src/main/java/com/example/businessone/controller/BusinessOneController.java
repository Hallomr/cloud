package com.example.businessone.controller;

import com.example.api.service.BusinessClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessOneController {
    @Autowired
    private BusinessClient businessClient;

    @GetMapping("/test")
    public void business(){
        String business = businessClient.business();
        System.out.println("=========" + business + "=========");
    }


}
