package spring.udemy.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Helicopter implements Vehicle{
    private static int chopperCount = 0;

    public Helicopter(){
        System.out.println("In constructor: " + getClass().getSimpleName());
        chopperCount++;
    }

    @Override
    public String getOperationVibe() {
        return "Choppy Whooshy Floaty Zoompy!";
    }

    public int getChopperCount(){
        return chopperCount;
    }
}
