package com.github.levoskaa.starbuzz.beverages.condiments;

import com.github.levoskaa.starbuzz.beverages.Beverage;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
