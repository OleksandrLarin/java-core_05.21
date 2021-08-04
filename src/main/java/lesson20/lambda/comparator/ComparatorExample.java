package lesson20.lambda.comparator;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>((left, right) -> {
            int length = right.length();
            int length1 = left.length();
            return Integer.compare(length, length1);
        });
        set.add("CCCcc");
        set.add("ABC");
        set.add("BCCc");

        System.out.println(set);
    }
}
