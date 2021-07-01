package lesson11.generic.example6;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Book> {
    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void printAll() {
        for (T book : list) {
            book.printInfo();
        }
    }
}
