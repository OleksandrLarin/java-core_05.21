package lesson20.lambda;

import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c", "d");

        for (String string: strings) {
            System.out.println(string);
        }

        strings.forEach(string -> System.out.println(string.toUpperCase()));

        strings.forEach(System.out::println);
    }
}
