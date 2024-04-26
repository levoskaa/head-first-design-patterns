package com.github.levoskaa.starbuzz.beverages;

import lombok.Getter;

public abstract class Beverage {
    
    @Getter
    protected String description = "Unknown beverage";

    public abstract double cost();
}
