package lesson10.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateTask {
    public Set<String> getDuplicates(List<String> strings) {
        Set<String> duplicates = new HashSet<>();
        Set<String> set = new HashSet<>();
        for (String string : strings) {
            if (!set.add(string)) {
                duplicates.add(string);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        DuplicateTask task = new DuplicateTask();

        List<String> strings = new ArrayList<>() {{
            add("Java");
            add("C++");
            add("C#");
            add("Java");
            add("Python");
            add("C++");
        }};

        Set<String> duplicates = task.getDuplicates(strings);
        System.out.println(duplicates);
    }
}
