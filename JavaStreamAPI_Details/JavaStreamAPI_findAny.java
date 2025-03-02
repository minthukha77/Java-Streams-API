package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaStreamAPI_findAny {
    public static void main(String[] args) {
        // Creating a List of Integers
        List<Integer> list = Arrays.asList(4,5,6,7,8,9);
        // Using Stream findFirst()
        Optional<Integer> answer = list.stream().findAny();
        // if the stream is empty, an empty
        // Optional is returned.
        System.out.println(answer.orElseGet(() -> 0));

    }
}
