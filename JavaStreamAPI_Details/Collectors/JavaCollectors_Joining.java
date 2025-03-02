package JavaStreamAPI_Details.Collectors;

import java.util.List;
import java.util.stream.Collectors;

public class JavaCollectors_Joining {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> words = List.of("Java", "Stream", "API");

        // Using Collectors.joining() to concatenate strings
        String joined = words.stream()
                .collect(Collectors.joining());
        // Output the result
        System.out.println("Joined string: " + joined);


        // Using Collectors.joining(", ") to concatenate strings with a comma and space
        String joined2 = words.stream()
                .collect(Collectors.joining(", "));
        // Output the result
        System.out.println("Joined string: " + joined2);


        // Using Collectors.joining with a delimiter, prefix, and suffix
        String joined3 = words.stream()
                .collect(Collectors.joining("@","[","]"));
        // Output the result
        System.out.println("Joined string: " + joined3);
    }
}
