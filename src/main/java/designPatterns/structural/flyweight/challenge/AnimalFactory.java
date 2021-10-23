package designPatterns.structural.flyweight.challenge;

import java.util.HashMap;

public class AnimalFactory {

    HashMap<Integer, Animal> animals = new HashMap<>();

    Animal getAnimal(int animalType) {
        if (animals.containsKey(animalType)) {
            return animals.get(animalType);
        } else {
            Animal animal;
            if (animalType == 0) {
                animal = new Lion();
            } else {
                animal = new Tiger();
            }
            return animal;
        }
    }
}
