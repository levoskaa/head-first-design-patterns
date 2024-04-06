package com.github.levoskaa.ducks.behaviors;

import com.github.levoskaa.ducks.behaviors.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
