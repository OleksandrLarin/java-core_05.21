package lesson20.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> string = getString();
        if (string.isPresent()) {
            System.out.println(string.get());
        }
        System.out.println(string.orElse("Default String"));


        string.ifPresent(str-> System.out.println(str.toUpperCase()));

        Optional<String> str1 = string
                .map(String::toUpperCase)
                .filter(str -> str.startsWith("STR"));

        str1.ifPresent(System.out::println);
    }

    public static Optional<String> getString() {
        int i = new Random().nextInt(10);
        if (i % 2 == 0) {
            return Optional.empty();
        }
        return Optional.of("String");
    }
}
