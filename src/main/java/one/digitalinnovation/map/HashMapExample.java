package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> fifaWorldChampions = new HashMap<>();

        // adding the fifa world champions in map
        fifaWorldChampions.put("Brazil", 5);
        fifaWorldChampions.put("Germany", 4);
        fifaWorldChampions.put("Italy", 4);
        fifaWorldChampions.put("Uruguay", 2);
        fifaWorldChampions.put("Argentina", 2);
        fifaWorldChampions.put("French", 2);
        fifaWorldChampions.put("England", 1);
        fifaWorldChampions.put("Spain", 1);
        System.out.println(fifaWorldChampions);

        // update value for "Brazil" key
        fifaWorldChampions.put("Brazil", 6);
        System.out.println(fifaWorldChampions);

        System.out.println("get (argentina): " + fifaWorldChampions.get("Argentina"));

        System.out.println("containsKey (french): " + fifaWorldChampions.containsKey("French"));

        fifaWorldChampions.remove("French");
        System.out.println("containsKey (french): " + fifaWorldChampions.containsKey("French"));

        System.out.println("containsValue (6): " + fifaWorldChampions.containsValue(6));

        System.out.println("size: " + fifaWorldChampions.size());

        System.out.println(fifaWorldChampions);

        // navigates through all map registers
        for (Map.Entry<String, Integer> entry : fifaWorldChampions.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : fifaWorldChampions.keySet()) {
            System.out.println(key + " -- " + fifaWorldChampions.get(key));
        }

        System.out.println(fifaWorldChampions);

        System.out.println("containsKey (USA): " + fifaWorldChampions.containsKey("United States of America"));

    }
}
