package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();

        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianópolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");
        System.out.println(treeCapitals);

        // returns the first capital
        System.out.println("first: " + treeCapitals.first());

        // returns the last capital
        System.out.println("last: " + treeCapitals.last());

        // returns the first capital below on parameterized capital tree
        System.out.println("lower (florianópolis): " + treeCapitals.lower("Florianópolis"));

        // returns the first capital above in parameterized capital tree
        System.out.println("higher (florianópolis): " + treeCapitals.higher("Florianópolis"));

        System.out.println(treeCapitals);

        // returns the first capital on tree top, removing from set
        System.out.println("poll first: " + treeCapitals.pollFirst());

        // returns the first capital on tree final, removing from set
        System.out.println("poll last: " + treeCapitals.pollLast());

        System.out.println(treeCapitals);

        // navigates through all iterator items
        Iterator<String> iterator = treeCapitals.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
