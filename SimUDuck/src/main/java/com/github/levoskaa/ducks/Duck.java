package com.github.levoskaa.ducks;

import com.github.levoskaa.ducks.behaviors.fly.FlyBehavior;
import com.github.levoskaa.ducks.behaviors.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
