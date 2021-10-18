package functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {

    public static void main(String args[]) {

        List<String> words = new ArrayList<>(Arrays.asList("Bob", "Elephant", "Car", "House"));

        List<String> processedWords = words
                .parallelStream()
                .map(word -> {
                    System.out.println("Uppercasing word:" + word);
                    return word;
                })
                .map(word -> {
                    System.out.println("Adding ! to word: " + word);
                    return word + "!";
                })
                .collect(Collectors.toList());

    }
}
