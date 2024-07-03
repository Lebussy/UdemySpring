package spring.udemy.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle{
    @Override
    public String getOperationVibe() {
        return "Leany zoomy....BROOM! vibe!";
    }
}
