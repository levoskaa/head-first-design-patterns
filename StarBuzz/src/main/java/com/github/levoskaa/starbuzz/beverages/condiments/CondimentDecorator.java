package com.github.levoskaa.starbuzz.beverages.condiments;

import com.github.levoskaa.starbuzz.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    
    protected Beverage beverage;

    @Override
    public abstract String getDescription();
}
