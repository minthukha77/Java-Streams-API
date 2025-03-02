package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.List;

public class JavaStreamAPI_MapToInt {
    public static void main(String[] args) {


//        Key Difference
//        map() produces a Stream<T> for any type.
//        mapToInt() produces an IntStream for int primitives,
//        allowing operations like sum(), average(), etc., directly on int values.
//
        // Creating a list of Strings
        List<String> list = Arrays.asList("3", "6", "8",
                "14", "15");

        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        list.stream().map(num -> Integer.valueOf(num))
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

        System.out.println("=========================================================");


        List<String> names = List.of("Alice", "Bob", "Charlie");

        int totalLength = names.stream()
                .mapToInt(String::length) // Produces IntStream
                .sum(); // Direct summation of primitives

        System.out.println("Total Length (mapToInt): " + totalLength);





    }
}
