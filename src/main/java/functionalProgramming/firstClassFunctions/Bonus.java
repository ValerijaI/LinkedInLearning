package functionalProgramming.firstClassFunctions;

import functionalProgramming.firstClassFunctions.biNoArgsMoreArgsFunction.NoArgsFunction;

public class Bonus {

    public static void main(String args []) {

        NoArgsFunction<NoArgsFunction<String>> createGreater = () -> {
            String name = "Valerija";
            return () -> "Hello, " + name;
        };

        NoArgsFunction<String> greater = createGreater.apply();
        System.out.println(greater.apply());
    }
}
