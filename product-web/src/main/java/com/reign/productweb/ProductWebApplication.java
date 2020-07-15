package com.reign.productweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.reign")
public class ProductWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductWebApplication.class, args);
    }

}
