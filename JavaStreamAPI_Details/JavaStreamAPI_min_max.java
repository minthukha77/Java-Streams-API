package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class JavaStreamAPI_min_max {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        // Using stream.min() to get minimum
        // element according to provided Integer Comparator
        Integer var = list.stream().min(Integer::compare).get();
        System.out.println("Min Method : " + var);

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2);
        // Find the minimum number using min() and a comparator
        Optional<Integer> minNumber = numbers.stream()
                .min(Comparator.naturalOrder());
        minNumber.ifPresent(value -> System.out.println("Min Method : " + value)); // Prints: 1

        Optional<Integer> maxNumber = numbers.stream()
                .max(Comparator.naturalOrder());
        maxNumber.ifPresent(maxValue -> System.out.println("Max Method : " + maxValue)); // Prints: 25


        System.out.println("=============================================================");


        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        // Find the shortest word
        Optional<String> shortestWord = words.stream().min(Comparator.comparingInt(String::length));
        shortestWord.ifPresent(word -> System.out.println("Shortest word: " + word));
        // Find the longest word
        Optional<String> longestWord = words.stream()
                .max(Comparator.comparingInt(String::length));

        longestWord.ifPresent(word -> System.out.println("Longest word: " + word));







    }
}
