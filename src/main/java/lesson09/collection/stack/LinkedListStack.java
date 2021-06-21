package lesson09.collection.stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStack {
    private LinkedList<String> values = new LinkedList<>();

    public void push(String value) {
        values.addFirst(value);
    }

    public String pop() {
        return values.poll();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }
}
