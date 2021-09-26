package com.example.business_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.example.*")
@ComponentScan(basePackages={"com.example.api","com.example.business_one"})
public class BusinessOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessOneApplication.class, args);
    }

}
