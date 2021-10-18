package functionalProgramming.firstClassFunctions;

import functionalProgramming.firstClassFunctions.biNoArgsMoreArgsFunction.NoArgsFunction;

import java.util.function.Function;

public class ReturnFunctions {

    public static void main(String args[]) {

        NoArgsFunction<String> createPrinter = () -> {
            return "Hello function!";
        };

        NoArgsFunction<String> greater = createPrinter;

        System.out.println(greater.apply());

        Function<Integer, Integer> result = MyMath.createMultiplier(2);
        System.out.println(result.apply(5));
    }

    static class MyMath {

//        static Integer timesTwo(Integer x) {
//            return x * 2;
//        } Instead of this ->

        static Function<Integer, Integer> createMultiplier(Integer y) {
            return (Integer x) -> x * y;
        }
    }
}
