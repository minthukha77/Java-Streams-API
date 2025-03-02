import java.util.List;
import java.util.stream.Stream;

public class StreamForEachLoop {

    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Banana", "Avocado", "Orange");

        items.stream()
            .map(item-> item.toUpperCase())
            .forEach(System.out::println);


        items.forEach(item2 -> System.out.println("Items 2 " + item2.toUpperCase()));

    }



    
}
