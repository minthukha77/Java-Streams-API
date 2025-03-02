package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamAPI_flatMap {
    public static void main(String[] args) {
        // Creating a list of prime numbers
        Set<Integer> PrimeNumbers = Set.of(4, 7, 11, 13);
        // Creating a list of odd numbers
        Set<Integer> OddNumbers = Set.of(1, 3, 5);
        // Creating a list of even numbers
        Set<Integer> EvenNumbers = Set.of(2, 4, 6, 8);


        Set<Set<Integer>> nestedList = Set.of(PrimeNumbers, OddNumbers, EvenNumbers);

        // Printing the structure before flattening
        System.out.println("The Structure before flattening is : " + nestedList);


        // Flattening the list of lists into a single list using flatMap
        Set<Integer> flatMap = nestedList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toSet());


        // Printing the structure after flattening
        System.out.println("The Structure after flattening is : " + flatMap);
    }
}
