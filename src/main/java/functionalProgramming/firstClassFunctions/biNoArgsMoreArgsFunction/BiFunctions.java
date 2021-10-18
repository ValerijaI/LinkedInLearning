package functionalProgramming.firstClassFunctions.biNoArgsMoreArgsFunction;

import java.util.function.BiFunction;

public class BiFunctions {

    public static void main(String args[]) {
        BiFunction<Integer, Integer, Integer> add = (x, y) ->
                x + y;
        System.out.println(add.apply(190, 90));

        TriFunction<Integer, Integer, Integer, Integer> addThreeArgs = (x, y, z) -> x + y + z;
        System.out.println(addThreeArgs.apply(100, 200, 300));

        NoArgsFunction<String> getHello = () -> "Hello!";
        System.out.println(getHello.apply());
    }

}
