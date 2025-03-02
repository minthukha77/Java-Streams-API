package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamAPI_toArray {
    public static void main(String[] args) {
        /*
        Java Stream API
         */
            /*
            1. Using toArray() Without Arguments

             */
            Stream<String> nameList = Stream.of("Java", "Stream", "API");
            Object[] array = nameList.toArray();
            for(Object obj : array){
                System.out.println("Using toArray() Without Arguments in Java Stream API : " + obj);
            }

            /*
            2. Using toArray(IntFunction<A[]> generator)
             */
            Stream<String> stream = Stream.of("Java", "Stream", "API");
            String[] array2 = stream.toArray(String[]::new);
            for (String str2 : array2) {
                System.out.println("Using toArray(IntFunction<A[]> generator) in Java Stream API : " + str2);
            }

    /*
     Collections Framework
    */
        /*
            1. Using toArray() Without Arguments

        */
        Stream<String> nameList2 = Stream.of("Java", "Stream", "API");
        Object[] array3 = nameList2.toArray();
        for(Object obj : array3){
            System.out.println("Using toArray() Without Arguments in Collections Framework : " + obj);
        }

        /*
            2.Using toArray(IntFunction<A[]> generator)
         */
        List<String> list = List.of("Java", "Stream", "API");
        String[] array4 = list.toArray(new String[0]);
        for (String str2 : array4) {
            System.out.println(str2); // Prints each element
        }





    }
}
