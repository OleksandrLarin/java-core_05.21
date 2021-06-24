package lesson10.collection.map;

import lesson10.collection.Order;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Order> map = new HashMap<>(){{
            put("One", new Order(1));
        }};
        map.put("Two", new Order(2));
        Order order1 = map.get("One");
        System.out.println(order1);
        System.out.println(map.get("Two"));
    }
}
