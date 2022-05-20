package com.example.business.controller;

import com.example.api.service.BusinessClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController implements BusinessClient {
    @Override
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String business(){
        System.out.println("========= business =========");
        int i= 1/0;
        return "business success";
    }
}
