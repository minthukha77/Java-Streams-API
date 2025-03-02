package JavaStreamAPI_Details.Collectors;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaCollectors_Reducing {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = List.of(5, 12, 8, 20, 3);

        // Using Collectors.reducing() to calculate the sum
        int sum = numbers.stream()
                .collect(Collectors.reducing(0, Integer::sum));
        // Output the result
        System.out.println("Sum of elements: " + sum);

        Optional<Integer> sumOptional = numbers.stream().collect(Collectors.reducing(Integer::sum));
        // Output the result
        System.out.println("Optional of elements: " + sumOptional);

    }
}
