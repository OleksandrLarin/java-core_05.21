package lesson11.generic.example3;

import lesson11.generic.example1.User;

public class GenericArrayContainer<T> {
    private int index = 0;
    private T[] array;

    public GenericArrayContainer(T[] array) {
        this.array = array;
    }

    public void add(T item) {
        if (index < array.length) {
            array[index++] = item;
        }
    }

    public static void main(String[] args) {
//        GenericArrayContainer<String> strings = new GenericArrayContainer<>();
//        strings.add("str");
//        GenericArrayContainer<User> users = new GenericArrayContainer<>();
//        users.add(new User("name", "email"));
    }
}
