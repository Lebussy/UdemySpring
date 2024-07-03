package com.springUdemy.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // injecting properties for: vehicle.name and vehicle.wheels

    @Value("${vehicle.name}")
    private String vehicleName;

    @Value("${vehicle.wheels}")
    private int vehicleWheels;

    // Expose new endpoint for "vehicle info"
    @GetMapping("vehicleInfo")
    public String getVehicleInfo(){
        return "The %s has %d wheels!! WHeeeee!!!".formatted(vehicleName, vehicleWheels * 3);
    }

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
