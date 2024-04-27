package com.github.levoskaa.pizzastore;

import com.github.levoskaa.pizzastore.pizzas.Pizza;
import com.github.levoskaa.pizzastore.stores.ChicagePizzaStore;
import com.github.levoskaa.pizzastore.stores.NYPizzaStore;
import com.github.levoskaa.pizzastore.stores.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}