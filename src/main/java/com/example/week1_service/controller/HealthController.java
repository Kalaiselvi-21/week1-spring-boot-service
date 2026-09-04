package com.example.week1_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    String health(){
        return "Health endpoint is working";
    }
    @GetMapping("/api/info")
    String api_info(){
        return "Week 1 Api spring boot backend service";
    }
}
