package com.github.levoskaa;

import com.github.levoskaa.ducks.Duck;
import com.github.levoskaa.ducks.MallardDuck;
import com.github.levoskaa.ducks.ModelDuck;
import com.github.levoskaa.ducks.behaviors.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}