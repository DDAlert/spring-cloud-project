package com.example.springcloudconsumernode1.controller;

import com.example.springcloudconsumernode1.api.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComsumerController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloRemote.hello(name);
    }

}
