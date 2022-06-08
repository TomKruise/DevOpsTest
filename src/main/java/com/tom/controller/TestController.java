package com.tom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Test")
public class TestController {
    @GetMapping("/getHello")
    public String getHello() {
        return "Hello DevOps!";
    }

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable(value = "name") String name) {
        return "Hi " + name;
    }
}
