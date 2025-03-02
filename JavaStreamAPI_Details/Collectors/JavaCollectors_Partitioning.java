package JavaStreamAPI_Details.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaCollectors_Partitioning {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 20, 3);

        // Partition numbers into two groups: greater than 10 and not
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(x -> x > 10));

        System.out.println("Partitioned : " + partitioned);
    }
}
