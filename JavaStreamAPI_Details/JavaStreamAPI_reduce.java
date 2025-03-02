package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.List;

public class JavaStreamAPI_reduce {
    public static void main(String[] args) {
        /*
        Syntax of reduce():
        1. Without Identity (Optional):
            Optional<T> reduce(BinaryOperator<T> accumulator)

            BinaryOperator: A function that takes two arguments of the same type and produces
                            a single result.
            Returns: An Optional<T> because the stream might be empty.

        2.With Identity:
               T reduce(T identity, BinaryOperator<T> accumulator)

            Identity: An initial value (e.g., 0 for addition or 1 for multiplication).
            Returns: A result of type T.
         */

        //Example 1
        //T reduce(T identity, BinaryOperator<T> accumulator)

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("Sum: " + sum);
        //Example 3
        int multiply = numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println("Multiply: " + multiply);
        //Example 4
        List<String> Eg4Words = List.of("Java", "Stream", "API");
        // Using reduce with identity
        String concatenated = Eg4Words.stream().reduce("",(a,b)->a.concat(b));
        System.out.println("Concatenated: " + concatenated.trim());





        //Example 2
        //Optional<T> reduce(BinaryOperator<T> accumulator)
        List<String> words = List.of("cat", "elephant", "tiger", "dog");
        // Using reduce without identity
        String longest = words.stream()
                .reduce((word1,word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse("No Words");
        System.out.println("Longest word: " + longest);





    }
}
