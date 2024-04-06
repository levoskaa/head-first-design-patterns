package com.github.levoskaa.ducks.behaviors.quack;

public class MuteQuack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
