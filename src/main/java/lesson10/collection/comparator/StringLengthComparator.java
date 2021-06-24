package lesson10.collection.comparator;

import java.util.Comparator;

public class StringLengthComparator  implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return Integer.compare(left.length(), right.length());
    }
}
