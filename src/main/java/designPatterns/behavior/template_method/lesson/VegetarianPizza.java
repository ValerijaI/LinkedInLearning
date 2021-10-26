package designPatterns.behavior.template_method.lesson;

class VegetarianPizza extends Pizza {

    void addToppings() {
        super.addToppings();
    }

    void cook() {
        System.out.println("Cook in the oven for 15 minutes");
    }
}
