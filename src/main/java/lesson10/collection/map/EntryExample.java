package lesson10.collection.map;

import java.util.HashMap;
import java.util.Map;

public class EntryExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.setValue(entry.getValue() + ";"));
        }

        System.out.println(map);
    }
}
