package lesson10.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Java");
        set.add("C++");

        System.out.println(set);
    }
}
