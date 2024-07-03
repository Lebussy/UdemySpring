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
}
