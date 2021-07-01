package lesson11.generic.example5;

public class ComposedMethodAndType<T> {
    public void print(T t) {
        System.out.println(t);
    }

    public static <E> void printInfo(E[] elements) {
        for (E e: elements) {
            System.out.println(e);
        }
    }

    public <E> T printInfoNonStatic(E[] elements) {
        for (E e: elements) {
            System.out.println(e);
        }
        return null;
    }
}
