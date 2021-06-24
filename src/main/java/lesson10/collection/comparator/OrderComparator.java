package lesson10.collection.comparator;

import lesson10.collection.Order;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order left, Order right) {
        return Integer.compare(left.getId(), right.getId());
    }
}
