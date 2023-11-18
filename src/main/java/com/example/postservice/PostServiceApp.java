package com.example.postservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// @EnableEurekaClient is deprecated. Adding eureke-client dependency is sufficient.
@EnableDiscoveryClient
public class PostServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(PostServiceApp.class, args);
    }

}
