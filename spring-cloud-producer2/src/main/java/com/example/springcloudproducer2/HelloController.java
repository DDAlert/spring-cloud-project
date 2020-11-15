package com.example.springcloudproducer2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class HelloController {
    private static Logger logger = Logger.getLogger(String.valueOf(HelloController.class));
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        logger.info("request two name is " + name);
        try {
            Thread.sleep(1000000);
        }catch (Exception e){
            logger.info("hello two error" + e);
        }
        return "hello "+name+",this is producer2 first message";
    }
}
