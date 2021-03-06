package com.example.vuedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.vuedemo.config","com.example.vuedemo.controller"})
public class VueDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueDemoApplication.class, args);
    }

}
