package spring.udemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class Helicopter implements Vehicle{

    @Override
    public String getOperationVibe() {
        return "Choppy Whooshy Floaty Zoomp!";
    }
}
