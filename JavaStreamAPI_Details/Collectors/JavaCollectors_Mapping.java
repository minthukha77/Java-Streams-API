package JavaStreamAPI_Details.Collectors;

import java.util.List;
import java.util.stream.Collectors;

public class JavaCollectors_Mapping {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> words = List.of("Java", "Stream", "API", "Example");

        // Using Collectors.mapping() to map each string to its length and collect into a List
        List<Integer> lengths = words.stream()
                .collect(Collectors.mapping(String::length, Collectors.toList()));

        // Output the result
        System.out.println("Lengths of words: " + lengths);

    }

}
