package designPatterns.behavior.template_method.lesson;

public class MeatPizza extends Pizza{

    void addToppings() {
        super.addToppings();
        System.out.println("Add peppers");
        System.out.println("Add meat");
    }

    void cook() {
        System.out.println("Cook in the oven for 28 minutes");
    }
}
