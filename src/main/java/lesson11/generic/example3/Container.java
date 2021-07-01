package lesson11.generic.example3;

public class Container<T> {
    private final String name;
    private T item;

    public Container(String name) {
        this.name = name;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Container{" +
                "name='" + name + '\'' +
                '}';
    }
}
