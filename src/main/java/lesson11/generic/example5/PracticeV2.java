package lesson11.generic.example5;

public class PracticeV2 {

    public <T> void printArray(T[] array) {
        for (T t: array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        PracticeV2 printer = new PracticeV2();
        String[] strings = {"a", "b"};
        printer.printArray(strings);
    }

}
