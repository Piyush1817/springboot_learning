package com.piyush.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hello_world {

    private String name = "Piyush";

    @GetMapping("/name")
    public String getName() {
        System.out.println("Hello World " + name);
        return name;
    }
}
