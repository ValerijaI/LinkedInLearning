package functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsCountingGroup {

    public static void main(String args []) {

        List<String> words = new ArrayList<>(Arrays.asList("Bob", "Elephant", "Car", "House"));

        Long count = words
                .stream()
                .filter(word -> word.length() > 3)
                .collect(Collectors.counting());

        System.out.println(count);

        Map<Integer, List<String>>groupedWords = words
                .stream()
                .collect(Collectors.groupingBy(
                        (word) -> word.length()
                ));

        System.out.println(groupedWords);

        Map<Boolean, List<String>> longerWords = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length() > 4
                ));

        System.out.println(longerWords);
    }
}
