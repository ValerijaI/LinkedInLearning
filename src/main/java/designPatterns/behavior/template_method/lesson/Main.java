package designPatterns.behavior.template_method.lesson;

public class Main {

    public static void main(String[] args) {
        VegetarianPizza vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.printInstructions();

        MeatPizza meatPizza = new MeatPizza();
        meatPizza.printInstructions();
    }

}
