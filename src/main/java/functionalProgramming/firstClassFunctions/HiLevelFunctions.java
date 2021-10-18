package functionalProgramming.firstClassFunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HiLevelFunctions {

    public static void main(String args[]) {

        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error");
                        return 0f;
                    }
                    return func.apply(x, y);
                };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide);

        System.out.println(divideSafe.apply(10f, 0f));
        System.out.println(divideSafe.apply(10f, 3f));
    }
}
