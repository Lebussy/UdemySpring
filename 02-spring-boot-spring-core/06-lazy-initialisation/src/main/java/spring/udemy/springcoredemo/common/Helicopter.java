package spring.udemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class Helicopter implements Vehicle{
    public Helicopter(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getOperationVibe() {
        return "Choppy Whooshy Floaty Zoompy!";
    }
}
