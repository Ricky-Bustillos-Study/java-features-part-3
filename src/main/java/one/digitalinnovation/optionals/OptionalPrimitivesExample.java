package one.digitalinnovation.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalPrimitivesExample {

    public static void main(String[] args) {

        System.out.println("Integer optional value");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Decimal optional value");
        OptionalDouble.of(21.5).ifPresent(System.out::println);

        System.out.println("Long optional value");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
