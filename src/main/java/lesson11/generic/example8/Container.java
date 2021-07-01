package lesson11.generic.example8;

public class Container<T extends Vehicle> {
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
