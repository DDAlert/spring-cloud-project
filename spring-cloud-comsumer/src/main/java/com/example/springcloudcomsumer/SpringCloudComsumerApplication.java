package com.example.springcloudcomsumer;

import com.example.springcloudcomsumer.api.HelloRemote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudComsumerApplication.class, args);
    }

}
