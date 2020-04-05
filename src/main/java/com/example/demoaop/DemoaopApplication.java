package com.example.demoaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
public class DemoaopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoaopApplication.class, args);
    }

}
