package com.example.springcloudcomsumer.impl;

import com.example.springcloudcomsumer.api.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello " +name+", this messge send failed ";
    }
}
