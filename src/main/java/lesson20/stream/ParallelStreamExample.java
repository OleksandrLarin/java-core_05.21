package lesson20.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c", "d", "e", "f", "a", "b", "c", "d", "e", "f");

        long start = System.currentTimeMillis();
        List<Integer> collect = strings.stream().parallel()
                .map(ParallelStreamExample::convert)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        System.out.println(collect);
        System.out.println(end - start);
    }

    private static int convert(String string) {
        return string.hashCode();
    }
}
