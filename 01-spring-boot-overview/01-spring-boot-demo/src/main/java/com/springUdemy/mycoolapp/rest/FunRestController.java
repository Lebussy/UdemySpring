package com.springUdemy.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // For exposing a "/" endpoint that returns "Hello World!"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
}
