package spring.udemy.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Helicopter implements Vehicle{


    public Helicopter(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getOperationVibe() {
        return "Choppy Whooshy Floaty Zoompy!";
    }

    // Spring bean init method - after container initialised and bean is instantiated
    @PostConstruct
    public void startUpStuff(){
        System.out.println("Things that startup and setup for this " + getClass().getSimpleName() + " bean");
    }

    // Spring bean destroy method for cleanup - before container closed
    @PreDestroy
    public void cleanUpThings(){
        System.out.println("Things that are executed before the container is destroyed for " + getClass().getSimpleName() + " bean, goodbye bean!");
    }
}
