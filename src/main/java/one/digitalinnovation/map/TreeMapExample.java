package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitals = new TreeMap<>();

        treeCapitals.put("RS", "Porto Alegre");
        treeCapitals.put("SC", "Florianópolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "São Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("MG", "Belo Horizonte");

        System.out.println(treeCapitals);

        System.out.println("first key: " + treeCapitals.firstKey());

        System.out.println("last key: " + treeCapitals.lastKey());

        System.out.println("lower key (SC): " + treeCapitals.lowerKey("SC"));

        System.out.println("higher key: (SC)" + treeCapitals.higherKey("SC"));

        System.out.println(treeCapitals);

        System.out.println("firstEntry: " + treeCapitals.firstEntry().getKey() + " -- " + treeCapitals.firstEntry().getValue());

        System.out.println("lastEntry: " + treeCapitals.lastEntry().getKey() + " -- " + treeCapitals.lastEntry().getValue());

        System.out.println("lowerEntry: " + treeCapitals.lowerEntry("SC").getKey() + " -- " + treeCapitals.lowerEntry("SC").getValue());

        System.out.println("higherEntry: " + treeCapitals.higherEntry("SC").getKey() + " -- " + treeCapitals.higherEntry("SC").getValue());

        System.out.println(treeCapitals);

        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();

        System.out.println(firstEntry.getKey() + " -- " + firstEntry.getValue());

        System.out.println(lastEntry.getKey() + " -- " + lastEntry.getValue());

        System.out.println(treeCapitals);

        Iterator<String> iterator = treeCapitals.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitals.get(key));
        }

        for (String capital: treeCapitals.keySet()) {
            System.out.println(capital + " -- " + treeCapitals.get(capital));
        }

        for (Map.Entry<String, String> capital: treeCapitals.entrySet()) {
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }

    }
}
