package com.piyush.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_world {

    @GetMapping("/name")
    public String getName() {
        return "My name is Piyush";
    }
}
