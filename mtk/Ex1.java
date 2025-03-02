import mtk.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {

        //Ex1
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<= 5; i++){
            list.add(i);
        }
        System.out.println(list);

        List<Integer> list2 = list.stream()
                            .filter(n-> n%2 != 0)
                            .collect(Collectors.toList());

        System.out.println("Even List : " + list2);


        System.out.println("======================================");



        //Ex2

        List<String> sList = new ArrayList<>();
        sList.add("m");
        sList.add("t");
        sList.add("k");

        List<String> sList2 = sList.stream()
                            .map(String::toUpperCase)
                            .collect(Collectors.toList());

        System.out.println("String List : " + sList2);
        sList2.forEach(System.out::println);



        System.out.println("======================================");


        //Ex3
        List<String> ListEx3 = new ArrayList<>();
        ListEx3.add("min");
        ListEx3.add("thu");
        ListEx3.add("kha");

        int length = ListEx3.stream()
                            .map(String::length)
                            .reduce(0,Integer::sum);

        System.out.println("String Length : " + length);


        System.out.println("======================================");



        //Ex4
        List<Integer> list4 = new ArrayList<>();
        for(int i=1; i<= 5; i++){
            list4.add(i);
        }
        System.out.println(list4);

        int maxValue = list4.stream()
                        .mapToInt(Integer::intValue) // Convert each Integer to int
                        .reduce(Integer::max) // Find the maximum value
                        .orElseThrow(); // Handle the case where the list is empty

        System.out.println("Max Value: " + maxValue);


        System.out.println("======================================");




        //Ex5
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("apple", "500"));
        productList.add(new Product("orange", "200"));
        productList.add(new Product("pineapple", "300"));

        int totalPrice = productList.stream()           
                        .map(Product::getPrice)
                        .map(n-> String.valueOf(n))
                        .mapToInt(Integer::parseInt)
                        .reduce(0,Integer::sum);

        System.out.println("Total Price : " + totalPrice);
        
                   

    }
    
}



    

