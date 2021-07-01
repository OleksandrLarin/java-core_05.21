package lesson11.generic.example4;

import java.util.List;

public class Box<T> {
    private List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public T get(int index) {
        return list.get(index);
    }

    public void add(T item) {
        list.add(item);
    }
}
