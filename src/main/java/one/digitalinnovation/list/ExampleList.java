package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ricky");
        names.add("Joao");
        names.add("Maria");
        names.add("Fidel");
        names.add("Debussy");
        names.add("Beethoven");
        names.add("Mozart");
        System.out.println(names);

        names.set(2, "Larissa");
        System.out.println(names);

        Collections.sort(names);
        names.set(2, "Wesley");
        System.out.println(names);

        names.remove(3);
        System.out.println(names);

        names.remove("Wesley");
        System.out.println(names);

        String name = names.get(1);
        System.out.println(name);

        int position = names.indexOf("Joao");
        System.out.println(position);

        int size = names.size();
        System.out.println(size);

        names.remove("Larissa");
        size = names.size();
        System.out.println(size);

        boolean hasAnderson = names.contains("Anderson");
        System.out.println(hasAnderson);

        for (String itemName : names) {
            System.out.println("-->"+itemName);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {

            System.out.println("---->"+iterator.next());

        }

        names.clear();

        boolean listIsEmpty = names.isEmpty();
        System.out.println(listIsEmpty);

    }
}
