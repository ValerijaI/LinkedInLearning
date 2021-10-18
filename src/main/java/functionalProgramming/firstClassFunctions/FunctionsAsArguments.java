package functionalProgramming.firstClassFunctions;

import java.util.function.BiFunction;

public class FunctionsAsArguments {

    public static void main(String args[]) {
        System.out.println(MyMath.combine2And3(MyMath::add));
        System.out.println(MyMath.combine2And3(MyMath::subtract));

        System.out.println(MyMath.combine2And3((x, y) ->
                MyMath.minimalNumber(x, y)));

        System.out.println(MyMath.combine2And3((x, y) ->
                x * 8 + y - 4));
    }

    static class MyMath {

        static Integer add(Integer x, Integer y) {
            return x + y;
        }

        static Integer subtract(Integer x, Integer y) {
            return x - y;
        }

        static Integer combine2And3(BiFunction<Integer, Integer, Integer> combine) {
            return combine.apply(2, 3);
        }

        static Integer minimalNumber(Integer x, Integer y) {
            return x < y ?
                    x :
                    y;
        }
    }
}
