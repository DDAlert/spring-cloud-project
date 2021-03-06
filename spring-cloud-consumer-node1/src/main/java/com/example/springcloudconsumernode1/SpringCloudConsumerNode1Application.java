package com.example.springcloudconsumernode1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudConsumerNode1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerNode1Application.class, args);
    }

}
