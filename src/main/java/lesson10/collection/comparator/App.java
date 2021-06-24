package lesson10.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        YearComparator comparator = new YearComparator();

        Set<Integer> years = new TreeSet<>(comparator);
        years.add(1999);
        years.add(2001);
        years.add(1990);
        years.add(1995);
        years.add(2015);

        System.out.println(years);

        List<String> strings = new ArrayList<>() {{
            add("AA");
            add("b");
        }};

        StringLengthComparator lengthComparator = new StringLengthComparator();
        Collections.sort(strings, lengthComparator);
        System.out.println(strings);

        strings.sort(lengthComparator);
    }
}
