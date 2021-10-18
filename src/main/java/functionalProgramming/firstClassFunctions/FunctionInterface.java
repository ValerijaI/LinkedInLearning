package functionalProgramming.firstClassFunctions;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String args[]) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println("Triple: " + result);

        Function<Integer, Integer> mySubtract = MyMath::subtract;
        result = mySubtract.apply(5);
        System.out.println("Subtract: " + result);

        Function<Integer, Double> myDivide = MyMath::divide;
        Double resultDivision = myDivide.apply(3);
        System.out.println("Divide: " + resultDivision);
    }

    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }

        public static Integer subtract(Integer y) {
            return 10 - y;
        }

        public static Double divide(Integer x) {
            return (double)10 / x;
        }
    }
}
