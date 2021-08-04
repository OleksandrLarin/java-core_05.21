package lesson20.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("a", "b", "c");

        List<String> strings = List.of("a", "b", "c");
        Stream<String> stream = strings.stream();

        String[] stringArray = {"a", "b", "C"};
        Stream<String> stringArray1 = Stream.of(stringArray);
    }
}
