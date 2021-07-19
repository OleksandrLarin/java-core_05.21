package lesson12.generic.example01;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcardExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<? extends Number> numbers = integers;
        numbers = doubles;

        integers.add(55);
        doubles.add(5.5);
        numbers.add(null);
    }
}
