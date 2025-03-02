package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.List;

public class JavaStreamAPI_anyMatch {
    public static void main(String[] args) {

        //anyMatch()
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        // Stream anyMatch(Predicate predicate)
        boolean answer = list.stream().anyMatch(n->n == 12);
        // Displaying the result
        System.out.println("Any Match : " + answer);


        // allMatch()
        List<String> allMatchList = Arrays.asList("Aung","Aung");
        boolean allMatch = allMatchList.stream().allMatch(n->n.equals("Aung"));
        // Displaying the result
        System.out.println("All Match : " + allMatch);









    }
}
