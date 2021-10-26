package designPatterns.behavior.visitor.lesson;

import java.util.ArrayList;

public class GroceryList implements Groceries {

    ArrayList<Groceries> groceries = new ArrayList<>();

    GroceryList() {
        Bread bread = new Bread();
        Bread bread1 = new Bread();
        Milk milk = new Milk();
        groceries.add(bread);
        groceries.add(milk);
        groceries.add(bread1);
    }

    @Override
    public double getPrice() {
        return groceries.stream().mapToDouble(Groceries::getPrice).sum();
    }

    @Override
    public void accept(Visitor visitor) {
        groceries.forEach(g -> g.accept(visitor));
        visitor.visit(this);
    }
}
