package com.github.levoskaa.ducks;

import com.github.levoskaa.ducks.behaviors.fly.FlyNoWay;
import com.github.levoskaa.ducks.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
