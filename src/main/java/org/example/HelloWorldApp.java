package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(HelloWorldApp.class, args);
    }
}