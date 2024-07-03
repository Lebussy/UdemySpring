package spring.udemy.springcoredemo.third.party.pack;

import spring.udemy.springcoredemo.common.Vehicle;

// No component annotation!!
// Third party vehicle we cant access this file ,,, you cant see this!!!
public class SnowMachine implements Vehicle {

    public SnowMachine(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getOperationVibe() {
        return "Broomy Floaty Powdery Zoomy CHILLY vibes";
    }
}
