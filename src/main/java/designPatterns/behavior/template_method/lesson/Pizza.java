package designPatterns.behavior.template_method.lesson;

abstract class Pizza {

    void makeBase() {
        System.out.println("Mix flour, yeast and salt");
        System.out.println("Roll out the dough");
    }

    void addToppings() {
        System.out.println("Add tomato");
        System.out.println("Add cheese");
        System.out.println("Add peppers");
    }

    void cook() {
    }

    void printInstructions() {
        makeBase();
        addToppings();
        cook();
        System.out.println();
    }
}
