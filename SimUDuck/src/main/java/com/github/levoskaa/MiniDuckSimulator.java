package com.github.levoskaa;

import com.github.levoskaa.ducks.Duck;
import com.github.levoskaa.ducks.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}