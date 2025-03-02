package JavaStreamAPI_Details;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamAPI_distinct {

    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
        System.out.println("The distinct elements are :");
        // Displaying the distinct elements in the list
        // using Stream.distinct() method
        list.stream().distinct().forEach(System.out::println);


        System.out.println("=========================================================");



        // Creating a list of strings
        List<String> stringList = Arrays.asList("Geeks", "for", "Geeks",
                "GeeksQuiz", "for", "GeeksforGeeks");

        System.out.println("The distinct elements are :");

        // Displaying the distinct elements in the list
        // using Stream.distinct() method
        List<String>  name = stringList.stream().distinct().collect(Collectors.toList());

        System.out.println(name);



        System.out.println("=========================================================");


        // Creating a list of strings
        List<String> countList = Arrays.asList("Geeks", "for", "Geeks",
                "GeeksQuiz", "for", "GeeksforGeeks");

        // Storing the count of distinct elements
        // in the list using Stream.distinct() method
        long Count = countList.stream().distinct().count();

        // Displaying the count of distinct elements
        System.out.println("The count of distinct elements is : " + Count);




        System.out.println("=========================================================");


        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Alice", 30), // Duplicate based on content
                new Person("Charlie", 35)
        );

        List<Person> distinctPeople = people.stream().skip(3)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctPeople);

    }
}


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

