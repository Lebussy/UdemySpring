package spring.udemy.springcoredemo.rest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.udemy.springcoredemo.common.Helicopter;
import spring.udemy.springcoredemo.common.Vehicle;

@RestController
public class WhatVibeController {

    private Vehicle thisVehicle;

    // Beans from third party sources need a configuration class for returning beans that cannot be
    //@Component annotated without access to source code
    // @Autowired identifies to spring that this constructor method needs to inject a dependency.
    @Autowired
    public WhatVibeController(
            // @Qualifier used if multiple beans can be injected into this method.
            // Bean id used in qualifier to identify the bean to be injected.
            // Bean annotated with its id or automatically assigned as className (first letter lower case)
            @Qualifier("snowyInc") Vehicle vehicle){
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.thisVehicle = vehicle;
    }

    @GetMapping("/vehicle-vibe")
    public String getChopperVibe(){
        return thisVehicle.getOperationVibe();
    }

}

// Process:
// Spring container initialised - any methods annotated with @PostConstruct are called
// Spring scans for components and instantiates any beans that are found.
// Spring injects any dependencies into the autowired constructors or setter methods