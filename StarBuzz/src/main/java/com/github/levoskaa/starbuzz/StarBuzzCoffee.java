package com.github.levoskaa.starbuzz;

import com.github.levoskaa.starbuzz.beverages.Beverage;
import com.github.levoskaa.starbuzz.beverages.DarkRoast;
import com.github.levoskaa.starbuzz.beverages.Espresso;
import com.github.levoskaa.starbuzz.beverages.HouseBlend;
import com.github.levoskaa.starbuzz.beverages.condiments.Mocha;
import com.github.levoskaa.starbuzz.beverages.condiments.Soy;
import com.github.levoskaa.starbuzz.beverages.condiments.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf("%s $%.2f%n",
            beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf("%s $%.2f%n",
            beverage2.getDescription(), beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf("%s $%.2f%n",
            beverage3.getDescription(), beverage3.cost());
    }
}