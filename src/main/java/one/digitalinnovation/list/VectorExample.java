package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        List<String> sports = new Vector<>();

        // add 4 sports
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Handball");

        // update value in position 2
        sports.set(2, "Ping pong");

        sports.remove(2);

        sports.remove("Handball");

        System.out.println(sports.get(0));

        for (String sport : sports) {
            System.out.println(sport);
        }
    }
}
