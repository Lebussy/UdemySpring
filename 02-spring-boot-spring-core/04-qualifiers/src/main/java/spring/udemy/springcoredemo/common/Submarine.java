package spring.udemy.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Submarine implements Vehicle{
    @Override
    public String getOperationVibe() {
        return "Bubbly deeply crouch float vibe!";
    }
}
