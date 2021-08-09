package one.digitalinnovation.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Ricky");
        students.add("Rafaela");
        students.add("Mariana");
        students.add("Juliana");
        students.add("Rafael");
        students.add("Enzo");

        System.out.println("Count: " + students.stream().count());

        System.out.println("Max: " + students.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Min: " + students.stream().min(Comparator.comparingInt(String::length)));

        // returns all names that contains 'R'
        System.out.println("With R letter: " + students.stream().filter(student ->
                student.toLowerCase().contains("r")).collect(Collectors.toList()));

        // returns a new collection with names concatenated with the length of each name
        System.out.println("Returns a new collection with letter quantity: " + students.stream().map(student ->
                student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));

        // returns only the first 3 elements of the collection
        System.out.println("Returns the first 3 elements: " + students.stream().limit(3).collect(Collectors.toList()));

        // show each element in the console and returns the same collection
        System.out.println("Returns elements: " + students.stream().peek(System.out::println).collect(Collectors.toList()));

        // show each element in the console without returning another collection
        System.out.println("Returns elements again: ");
        students.stream().forEach(System.out::println);

        // returns true if all elements have 'W'
        System.out.println("Exists with 'W'? " + students.stream().allMatch(element -> element.contains("W")));

        // returns true if any element have 'a'
        System.out.println("Exists with 'a'? " + students.stream().anyMatch(element -> element.contains("a")));

        // returns true if none element have 'a'
        System.out.println("Not exists with 'a'? " + students.stream().noneMatch(element -> element.contains("a")));

        System.out.println("Return the first element of the collection");
        students.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Chained operation: ");
        System.out.println(students.stream()
                .peek(System.out::println)
                .map(student -> student.concat(" - ").concat(String.valueOf(student.length())))
                .peek(System.out::println)
                .filter(student -> student.toLowerCase().contains("r"))
                .collect(Collectors.toList())
                // .collect(Collectors.joining(", "))
                // .collect(Collectors.toSet())
                // .collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-") + 1)))
        );
    }
}
