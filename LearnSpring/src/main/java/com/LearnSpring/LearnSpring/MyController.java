package com.LearnSpring.LearnSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("hello")
    public String sayHello() {
        return "Hello from MyController";
    }
}
