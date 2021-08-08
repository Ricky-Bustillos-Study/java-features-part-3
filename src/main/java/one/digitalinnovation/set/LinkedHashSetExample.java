package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numericSequence = new LinkedHashSet();

        numericSequence.add(16);
        numericSequence.add(2);
        numericSequence.add(8);
        numericSequence.add(4);
        numericSequence.add(1);
        System.out.println(numericSequence);

        numericSequence.remove(4);
        System.out.println("removed 4: " + numericSequence);

        System.out.println("size: " + numericSequence.size());

        Iterator<Integer> iterator = numericSequence.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer number: numericSequence) {
            System.out.println(number);
        }

        numericSequence.clear();

        System.out.println("clear: " + numericSequence.isEmpty());


    }
}
