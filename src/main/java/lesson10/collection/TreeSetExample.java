package lesson10.collection;

import lesson10.collection.comparator.OrderComparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Java");
        set.add("JavaScript");
        set.add("C++");
        set.add("C#");
        set.add("Python");

        System.out.println(set);

        Set<Order> orders = new TreeSet<>(new OrderComparator());

        orders.add(new Order(5));
        orders.add(new Order(55));
        orders.add(new Order(51));
        orders.add(new Order(15));
        orders.add(new Order(7));

        System.out.println(orders);
    }
}
