package mtk;

import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = List.of();

        Optional<String> first = names.stream().findFirst();

        System.out.println("Optional " + first);


    }
}
