package com.saad.keyclock;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class Controller {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello(){
        System.out.println("Method is called from controller");
        return "Hello from the spring boot & Key Clock";
    }
    @GetMapping("/hello")
    @PreAuthorize("hasRole('client_Admin')")
    public String hello2(){
        System.out.println("Method is called from controller");
        return "Hello from the spring boot & Key Clock - Admin";
    }
}
