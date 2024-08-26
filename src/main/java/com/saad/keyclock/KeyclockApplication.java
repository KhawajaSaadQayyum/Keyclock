package com.saad.keyclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class KeyclockApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyclockApplication.class, args);
        System.out.println("Welcome to Spring Boot Learning");
    }

}
