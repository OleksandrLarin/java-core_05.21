package lesson10.collection.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(1, "One");

        System.out.println(numbers);
        System.out.println(numbers.descendingKeySet());
        System.out.println(numbers.descendingMap());

        System.out.println(numbers.descendingMap().firstEntry());
        System.out.println(numbers.pollLastEntry());
        System.out.println(numbers);
    }
}
