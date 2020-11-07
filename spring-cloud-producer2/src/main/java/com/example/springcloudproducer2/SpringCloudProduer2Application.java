package com.example.springcloudproducer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProduer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProduer2Application.class, args);
    }

}
