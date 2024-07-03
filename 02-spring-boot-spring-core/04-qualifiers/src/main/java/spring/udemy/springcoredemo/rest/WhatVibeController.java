package spring.udemy.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.udemy.springcoredemo.common.Vehicle;

@RestController
public class WhatVibeController {

    private Vehicle thisVehicle;

    @Autowired
    public WhatVibeController(@Qualifier("motorbike") Vehicle vehicle){
        this.thisVehicle = vehicle;
    }

    @GetMapping("/chopper-vibe")
    public String getChopperVibe(){
        return thisVehicle.getOperationVibe();
    }
}
