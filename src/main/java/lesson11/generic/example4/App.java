package lesson11.generic.example4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Box<String> box = new Box(new ArrayList<>());

        box.add("string");
        box.add("string2");
        Object s = box.get(1);
        System.out.println(s);


        Box<Integer> ints = new Box<>(new ArrayList<>());

        ints.add(55);
        Integer integer = ints.get(0);
        System.out.println(integer);
    }
}
