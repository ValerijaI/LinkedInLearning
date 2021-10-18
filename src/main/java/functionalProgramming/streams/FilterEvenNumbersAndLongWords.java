package functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenNumbersAndLongWords {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Predicate<Integer> isEven = (x) -> x % 2 == 0;

        List<Integer> result = list.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        List<String>words = new ArrayList<>(Arrays.asList("Bob", "Elephant", "Car", "House"));

        Function<Integer, Predicate<String>> moreThan5Letters = (minLength) -> {
            return (word) -> word.length() > minLength;
        };

        List<String>longWords = words
                .stream()
                .filter(moreThan5Letters.apply(4))
                .collect(Collectors.toList());

        longWords.forEach(System.out::println);
    }
}
