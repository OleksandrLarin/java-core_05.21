package lesson11.generic.example3;

import java.util.HashMap;
import java.util.Map;

public class MultiType<T, U, V> {

    private T field;

    public static void main(String[] args) {
        MultiType<Double, Number, Integer> container = new MultiType<>();
        Double field = container.getField();

        Number convert = container.convert(123);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
    }

    public U convert(V v) {
        return null;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
