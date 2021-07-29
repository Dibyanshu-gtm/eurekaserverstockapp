package com.example.eurekaserverstockapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverstockappApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverstockappApplication.class, args);
    }

}
