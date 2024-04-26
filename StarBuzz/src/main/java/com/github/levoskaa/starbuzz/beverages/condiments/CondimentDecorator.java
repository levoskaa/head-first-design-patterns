package com.github.levoskaa.starbuzz.beverages.condiments;

import com.github.levoskaa.starbuzz.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    
    private Beverage beverage;

    @Override
    public abstract String getDescription();
}
