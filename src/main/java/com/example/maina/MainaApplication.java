package com.example.maina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainaApplication.class, args);
    }

    @GetMapping("/")
    public String getWebsiteName() {
        return "static/index.html";
    }
}
