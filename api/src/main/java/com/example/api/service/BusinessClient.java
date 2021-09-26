package com.example.api.service;


import com.example.api.fallback.BusinessClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "business", path = "business",fallback = BusinessClientFallback.class)
public interface BusinessClient {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String business();
}
