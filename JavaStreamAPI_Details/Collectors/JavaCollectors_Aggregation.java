package JavaStreamAPI_Details.Collectors;

import java.util.List;
import java.util.stream.Collectors;

public class JavaCollectors_Aggregation {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = List.of(5, 12, 8, 20, 3);

        //Count elements
        long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count of elements: " + count);


        // Using Collectors.summingInt() to calculate the sum
        int sum = numbers.stream().collect(Collectors.summingInt(x->x));
        System.out.println("Sum of elements: " + sum);

        // Using Collectors.averagingInt() to calculate the average
        double avg = numbers.stream().collect(Collectors.averagingInt(x->x));
        System.out.println("Average of elements: " + avg);




    }
}
