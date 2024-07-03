package spring.udemy.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatVibeController {

    private Vehicle thisVehicle;

    @Autowired
    public WhatVibeController(Vehicle thisVehicle){
        this.thisVehicle = thisVehicle;
    }

    @GetMapping("/chopper-vibe")
    public String getChopperVibe(){
        return thisVehicle.getOperationVibe();
    }
}
