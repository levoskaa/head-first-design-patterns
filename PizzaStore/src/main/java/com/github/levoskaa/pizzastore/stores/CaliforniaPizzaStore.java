package com.github.levoskaa.pizzastore.stores;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "veggie" -> new CaliforniaStyleVeggiePizza();
            default -> null;
        };
    }
}
