package lesson10.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        if (set.add("Java")) {
            System.out.println("Element was added");
        } else {
            System.out.println("Element already exists");
        }
        System.out.println(set);

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        list.add("C++");

        set.addAll(list);

        System.out.println(set);
    }
}
