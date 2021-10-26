package designPatterns.behavior.visitor.lesson;

public class Main {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        System.out.println("Total price of grocery list: " + groceryList.getPrice());
        groceryList.accept(new DiscountVisitor());
        System.out.println("New price" + groceryList.getPrice());
    }
}
