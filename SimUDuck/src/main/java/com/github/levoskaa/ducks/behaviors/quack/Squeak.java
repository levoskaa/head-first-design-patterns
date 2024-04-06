package com.github.levoskaa.ducks.behaviors.quack;

public class Squeak implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
