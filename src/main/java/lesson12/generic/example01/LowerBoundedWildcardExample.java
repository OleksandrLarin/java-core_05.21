package lesson12.generic.example01;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        addNumber(integers);
    }

    public static void addNumber(List<? super Integer> integers) {
        integers.add(11);
        Object number = integers.get(0);
    }
}
