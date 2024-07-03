package spring.udemy.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class Helicopter implements Vehicle{

    @Override
    public String getOperationVibe() {
        return "Choppy Whooshy Floaty Zoomp!";
    }
}
