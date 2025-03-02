package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI_Sorted {
    public static void main(String[] args) {

        // Sorting a List of Numbers (Natural Order)
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Natural Order " + sortedNumbers);

        System.out.println("=========================================================");


        // Sorting a List of Strings (Custom Order)
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        List<String> sortedNames = names.stream().sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println("Sorting a List of Strings (Custom Order) " + sortedNames);


        System.out.println("=========================================================");



        // Sorting Objects with Natural Order
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1000),
                new Product("Phone", 500),
                new Product("Tablet", 700)
        );
        List<Product> sortedProducts = products.stream()
                .sorted() // Natural order sorting using Comparable
                .collect(Collectors.toList());
        System.out.println("Sorting Objects with Natural Order " + sortedProducts);


        System.out.println("=========================================================");

        //Sorting Objects with Custom Comparator

        List<Product> sortedCustomProduct = products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());

        System.out.println("Sorting Objects with Custom Comparator " + sortedCustomProduct);


    }
}


    class Product implements Comparable<Product> {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + ": " + price;
        }


        @Override
        public int compareTo(Product other) {
            return Double.compare(this.price, other.price); // Natural order by price
        }
    }

