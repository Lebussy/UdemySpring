package spring.udemy.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.udemy.springcoredemo.third.party.pack.SnowMachine;
import spring.udemy.springcoredemo.common.Vehicle;

// Configuration class annotated to identify that this class is responsible for returning
// configuring bean dependency.
// @Bean annotation identifies a method that returns a spring bean for spring to manage.
@Configuration
public class VehicleConfig {

    @Bean("snowyInc")
    public Vehicle snowMachine(){
        System.out.println("Configuration class calls snowMachine() method");
        return new SnowMachine();
    }

}
