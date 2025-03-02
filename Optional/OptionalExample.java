package Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        // API 1: Using Optional.of() with a non-null value
        Optional<String> optionalString = Optional.of("Hello");
        System.out.println("API 1: " + optionalString.get());

        // API 2: Using Optional.ofNullable() with a null value
        String a = "B";
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("API 2: Is value present? : " + optionalNull.orElse("null"));

        // API 3: Using Optional.ofNullable() with a non-null value
        Optional<String> optionalNonNull = Optional.ofNullable("Hello, Java!");
        optionalNonNull.ifPresent(value -> System.out.println("API 3: " + value));  // Prints "Hello, Java!"

        // API 4: Using orElse() to provide a default value
        String result = optionalNull.orElse("Default Value");
        System.out.println("API 4: " + result);  // Prints "Default Value"

        // API 5: Using orElseGet() to provide a default value via a Supplier
        String result2 = optionalNull.orElseGet(() -> "Default from Supplier");
        System.out.println("API 5: " + result2);

        // API 6: Using map() to transform the value
        Optional<String> transformed = optionalNonNull.map(s -> s.toUpperCase());
        System.out.println("API 6: " + transformed.get());  // Prints "HELLO, JAVA!"

        // API 7: Using empty() to returns an empty Optional, which contains no value.
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("API 7: Is the Optional empty? " + emptyOptional.isEmpty());  // Prints true

        // API 8: Using isPresent() to check if a value is present in the Optional.
        Optional<String> optional = Optional.of("Hello, World!");
        Optional<String> emptyOptional2 = Optional.empty();
        System.out.println("API 8: Is the Optional present? " + optional.isPresent());  // Prints true
        System.out.println("API 8: Is the Optional present? " + emptyOptional2.isPresent()); // Prints false

        // API 9: Using isPresent() to executes a given action if a value is present,
        // otherwise executes a fallback action.
        // Case 1: When value is present
        optional.ifPresentOrElse(
                value -> System.out.println("API 9: Value is present : " + value),
                () -> System.out.println("API 9: Value is Absent")

        );

        // API 10: Using flatMap() to transforms the value inside the Optional
        // using a function that returns another Optional.
        Optional<String> flatMapOption = Optional.of("Hello, World!");
        // FlatMap example where we transform the string to uppercase and wrap it in an Optional
        Optional<String> upperCaseOptional = flatMapOption.flatMap(value -> Optional.of(value.toUpperCase()));
        upperCaseOptional.ifPresent(value -> System.out.println("API 10: Value is present : " + value));


        //API 11: Using equals() to compare two Optional instances to check if
        // they contain the same value.
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        System.out.println("API 11 : optional1 equals optional2? " + optional1.equals(optional2));  // Prints true


        //API 12: Using toString()
        Optional<String> StringOptional = Optional.of("Hello, World!");
        Optional<String> StringEmptyOptional = Optional.empty();
        System.out.println("API 12 : Optional toString (non-empty): " + StringOptional.get().toString());  // Prints Optional[Hello, World!]
        System.out.println("API 12 : Optional toString (empty): " +     StringEmptyOptional.orElse("Something Value"));  // Prints Optional.empty
    }
}























