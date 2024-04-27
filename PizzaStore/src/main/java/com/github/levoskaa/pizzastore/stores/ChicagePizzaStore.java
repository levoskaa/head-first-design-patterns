package com.github.levoskaa.pizzastore.stores;

import com.github.levoskaa.pizzastore.pizzas.ChicagoStyleCheesePizza;
import com.github.levoskaa.pizzastore.pizzas.ChicagoStyleClamPizza;
import com.github.levoskaa.pizzastore.pizzas.ChicagoStylePepperoniPizza;
import com.github.levoskaa.pizzastore.pizzas.ChicagoStyleVeggiePizza;
import com.github.levoskaa.pizzastore.pizzas.Pizza;

public class ChicagePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }    
}
