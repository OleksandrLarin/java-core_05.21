package lesson10.collection.map;

import java.util.HashMap;
import java.util.Map;

public class RandomHashCodeExample {
    private final int id;
    private String name;

    public RandomHashCodeExample(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Map<RandomHashCodeExample, String> map = new HashMap<>();
        RandomHashCodeExample random = new RandomHashCodeExample(123);
        random.setName("Java");
        map.put(random, "VALUE");
        random.setName("JAVA");

        System.out.println(map.get(random));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
