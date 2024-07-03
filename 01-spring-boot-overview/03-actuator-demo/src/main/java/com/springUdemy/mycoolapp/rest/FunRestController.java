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
    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run for 15 minute!";
    }
    // expose a new endpoint for cat pics
    @GetMapping("/catz")
    public String getCats(){
        return "Pus pic";
    }
}
