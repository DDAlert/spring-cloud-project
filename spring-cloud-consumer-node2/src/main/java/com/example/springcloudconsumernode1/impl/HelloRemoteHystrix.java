package com.example.springcloudconsumernode1.impl;

import com.example.springcloudconsumernode1.api.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello " +name+", this messge send failed ";
    }
}
