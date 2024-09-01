package mtk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindElements {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(5,2,3,2,1);

        // findfirst and findAny() methods
        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent()){
            System.out.println("Elements Get " + element.get());
        }else{
            System.out.println("stream is empty");
        }

        Optional<Integer> element1 = list.stream().findAny();
        if(element.isPresent()){
            System.out.println("Elements Get " + element1.get());
        }else{
            System.out.println("stream is empty");
        }



        //count(), min(), max() methods

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Stream API of Count " + stream.count());


        Integer integer = Stream.of(1,2,3,4,5,6,7,8,9).min
                (Comparator.comparing(Integer::valueOf)).get();
        System.out.println(" Min =>" + integer);

        Integer integer2 = Stream.of(1,2,3,4,5,6,7,8,9).max
        (Comparator.comparing(Integer::valueOf)).get();
    System.out.println(" Max =>" + integer2);



      
        Integer[] a = {1, 2, 3, 4, 5};
        int min = a[0];
        int max = a[0];

        for(int b : a){
            if(b < min){
                min = b;
            } else if ( b > max){
                max = b;
            }
        }

        System.out.println("The smallest integer is: " + min);
        System.out.println("The largeest integer is: " + max);


        Optional<Integer> max2 = Arrays.stream(a)
                .min(Comparator.naturalOrder());

        max2.ifPresent( value -> System.out.println("The maximum value is: " + value));
        



    }
    
}
