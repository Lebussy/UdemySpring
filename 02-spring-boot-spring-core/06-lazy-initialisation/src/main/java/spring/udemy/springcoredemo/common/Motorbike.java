package spring.udemy.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Motorbike implements Vehicle{
    public Motorbike(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getOperationVibe() {
        return "Leany zoomy....BROOM! vibe!";
    }
}
