package com.samsung.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String getHello() {
        return "Hello world!";
    }

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable(name = "name") String name) {
        return "Hello " + name;
    }

}
