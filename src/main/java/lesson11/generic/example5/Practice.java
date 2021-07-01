package lesson11.generic.example5;

public class Practice<T> {

    public void printArray(T[] array) {
        for (T t: array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Practice<String> printer = new Practice<>();
        String[] strings = {"a", "b"};
        printer.printArray(strings);
    }

}
