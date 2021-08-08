package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<Double> studentGrade = new HashSet<>();

        // add grade in set
        studentGrade.add(5.8);
        studentGrade.add(9.3);
        studentGrade.add(6.5);
        studentGrade.add(10.0);
        studentGrade.add(5.4);
        studentGrade.add(7.3);
        studentGrade.add(3.8);
        studentGrade.add(4.0);
        System.out.println(studentGrade);

        studentGrade.remove(3.8);
        System.out.println(studentGrade);

    }
}
