package lesson10.collection.comparator;

import java.util.Comparator;

public class YearComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer left, Integer right) {
        return right - left;
    }
}
