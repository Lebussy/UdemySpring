package spring.udemy.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Submarine implements Vehicle{
    public Submarine(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getOperationVibe() {
        return "Bubbly deeply crouch float vibe!";
    }
}
