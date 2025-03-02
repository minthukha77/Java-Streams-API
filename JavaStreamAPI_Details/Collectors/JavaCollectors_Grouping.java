package JavaStreamAPI_Details.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCollectors_Grouping {
    public static void main(String[] args) {

        //Syntax
        /*
        groupingBy(classifier)
        groupingBy(classifier, downstream)
        groupingBy(classifier, mapFactory, downstream)

        Why Use It?

        Organizing Data:
                To partition data into meaningful groups.
                For example, categorizing products by type or employees by department.

        Simplifies Code:
                Eliminates the need for manual grouping with loops and conditionals.

        Supports Additional Operations:
                Combine with other collectors (e.g., counting, mapping, reducing) for
                advanced aggregations.
         */

        /*
         Syntax:groupingBy(classifier)
         */
        List<String> words = List.of("cat", "dog", "elephant", "bird", "ant");
        Map<Integer,List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("GroupedByLength : " + groupedByLength);


        /*
         Syntax:groupingBy(classifier, downstream)
         Grouping with Aggregation
         */
        Map<Integer, Long> countByLength = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println("CountByLength " + countByLength);


        /*
        Syntax:groupingBy(classifier, mapFactory, downstream)
        Customizing Values
         */
        Map<Integer,List<Character>> groupedByLength3 = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(s->s.charAt(0),Collectors.toList())
                ));
        System.out.println("GroupedByLength3 : " + groupedByLength3);

    }
}
