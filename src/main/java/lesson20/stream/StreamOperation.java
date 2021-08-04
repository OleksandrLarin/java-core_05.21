package lesson20.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[] args) {
        List<String> strings = List.of("aaa", "bbbb", "cc", "ddddd");

        long count = strings.stream()
                .map(string -> string + string)
                .filter(string -> string.length() > 4)
                .count();
        System.out.println(count);

        Optional<String> any = strings.stream()
                .map(string -> string + string)
                .filter(string -> string.length() > 4)
                .findFirst();
        if (any.isPresent()) {
            System.out.println(any.get());
        }

        boolean stringLength = strings.stream()
                .map(string -> string + string)
                .filter(string -> string.length() > 4)
                .noneMatch(string -> string.length() == 7);
        System.out.println(stringLength);


        Optional<String> reduce = strings.stream()
                .reduce((left, right) -> left + "_" + right);
        reduce.ifPresent(System.out::println);

        List<String> collect = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);

        String join = collect.stream().collect(Collectors.joining("_"));
        System.out.println(join);
    }
}
