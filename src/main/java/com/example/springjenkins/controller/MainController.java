package com.example.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class MainController {
    @GetMapping("/")
    public String home() {
        return "Hello Jenkins!!!!!!!!!!";
    }

    @GetMapping("/static-list")
    public List<String> list() {
        return Collections.singletonList("item1");
    }
}
