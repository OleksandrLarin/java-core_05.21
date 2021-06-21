package lesson09.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("JavaScript");
        strings.add(2, "C++");
        strings.remove(1);
        System.out.println(strings.size());
        System.out.println(strings);


        List<String> stringList = new ArrayList<>(strings);

        stringList.add("C#");
        stringList.addAll(strings);
        System.out.println(stringList);
        System.out.println(stringList.get(5));


        System.out.println("For:");
        iterateByFor(strings);

        System.out.println("For each:");
        iterateByForEach(strings);

        System.out.println("Iterator: ");
        iterateWithIterator(strings);
    }

    private static void iterateByFor(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(i + ". " + strings.get(i));
        }
    }

    private static void iterateByForEach(List<String> strings) {
        for (String name : strings) {
            System.out.println(name);
        }
    }

    private static void iterateWithIterator(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
