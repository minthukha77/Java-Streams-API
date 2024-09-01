package mtk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> sqaures =  numbers.stream()
                                 .map(n -> n*n)
                                 .collect(Collectors.toList());

        System.out.println(sqaures); // Output: [1, 4, 9, 16, 25]



        //                .stream().filter((products) -> products.getPrice() > 28000f)

        List<Integer> sqaures2 =  numbers.stream()
                                 .map(n -> n == 2 ? n+3 : n)
                                 .collect(Collectors.toList());

        System.out.println(sqaures2); // Output: [1, 4, 9, 16, 25]
    

    }
    
}


   

