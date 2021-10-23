package designPatterns.structural.decoratorPattern.challenge;

import java.util.ArrayList;

public class PizzaWithExtraCheese implements Pizza{

    ArrayList toppings;
    Pizza pizza;

    public PizzaWithExtraCheese(Pizza pizza) {
        this.pizza = pizza;
        this.toppings = pizza.getToppings();
        toppings.add("extra cheese");
    }

    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
