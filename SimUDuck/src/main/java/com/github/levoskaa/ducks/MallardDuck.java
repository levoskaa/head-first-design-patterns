package com.github.levoskaa.ducks;

import com.github.levoskaa.ducks.behaviors.fly.FlyWithWings;
import com.github.levoskaa.ducks.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
