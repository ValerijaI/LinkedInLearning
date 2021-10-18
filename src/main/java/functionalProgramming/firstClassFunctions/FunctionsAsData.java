package functionalProgramming.firstClassFunctions;

import functionalProgramming.firstClassFunctions.biNoArgsMoreArgsFunction.NoArgsFunction;

public class FunctionsAsData {

    public static void main(String args[]) {

        final Boolean IS_DEVELOPMENT = true;
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.personLoader.apply().name);
    }

    static class Person {
        private String name;
        private Integer age;

        Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class DataLoader {

        public final NoArgsFunction<Person> personLoader;

        DataLoader(boolean isDevelopment) {
            this.personLoader = isDevelopment ?
                    this::loadFakePerson :
                    this::loadFakePerson;
        }

        Person loadRealPerson() {
            System.out.println("Loading real person");
            return new Person("Real person", 30);
        }

        Person loadFakePerson() {
            System.out.println("Loading fake person");
            return new Person("Fake person", 100);
        }
    }
}
