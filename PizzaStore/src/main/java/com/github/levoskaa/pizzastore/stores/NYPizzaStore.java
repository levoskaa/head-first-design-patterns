package com.github.levoskaa.pizzastore.stores;

import com.github.levoskaa.pizzastore.pizzas.NYStyleCheesePizza;
import com.github.levoskaa.pizzastore.pizzas.NYStyleClamPizza;
import com.github.levoskaa.pizzastore.pizzas.NYStylePepperoniPizza;
import com.github.levoskaa.pizzastore.pizzas.NYStyleVeggiePizza;
import com.github.levoskaa.pizzastore.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "clam" -> new NYStyleClamPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };
    }
}
