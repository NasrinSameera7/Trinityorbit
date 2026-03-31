package com.trinityorbit.carbontracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarbonTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarbonTrackerApplication.class, args);
        System.out.println("Trinity Orbit Backend is running on http://localhost:8080");
    }
}