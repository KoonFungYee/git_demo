package com.example.git_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
