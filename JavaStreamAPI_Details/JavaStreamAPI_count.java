package JavaStreamAPI_Details;

import java.util.List;
import java.util.stream.Stream;

public class JavaStreamAPI_count {
    public static void main(String[] args) {
        //Counting After Transformation (map)
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        // Count the lengths of names longer than 3 characters
        long count = names.stream()
                                .map(String::length)
                                .peek(name -> System.out.println("Length :" + name))
                                .filter(name -> name > 5)
                                        .count();
        System.out.println("Names with length > 5: " + count); // Output: 3


        System.out.println("===================================================");


        // Generate an infinite stream of natural numbers
        Stream<Integer> infiniteStream = Stream.iterate(10, n -> n + 1);
        // Count the first 10 elements
        long countInfinite = infiniteStream
                .limit(10)
                .count();

        System.out.println("Count of first 10 elements: " + countInfinite); // Output: 10


    }
}
