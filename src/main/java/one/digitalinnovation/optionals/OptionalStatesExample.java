package one.digitalinnovation.optionals;

import java.util.Optional;

public class OptionalStatesExample {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Present value");
        System.out.println("Optional value that is present");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Isn't present"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Optional value that isn't present");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = isn't present"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Optional value that isn't present");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = isn't present"));

        try {
            Optional<String> optionalNullError = Optional.of(null);
            System.out.println("Optional value that throws a NullPointerException error");
            optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("error = isn't present"));
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
