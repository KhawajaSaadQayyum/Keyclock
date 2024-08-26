package com.saad.keyclock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class Controller {

    @GetMapping
    public String hello(){
        System.out.println("Method is called from controller");
        return "Hello from the spring boot & Key Clock";
    }
    @GetMapping("/hello")
    public String hello2(){
        System.out.println("Method is called from controller");
        return "Hello from the spring boot & Key Clock - Admin";
    }
}
