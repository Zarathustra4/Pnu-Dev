package com.example.hellomodule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {
    @GetMapping("/greetings")
    public String greetings(@RequestParam(value="name", defaultValue = "Max")String name){
        return String.format("Hello, %s!!!", name);
    }
}
