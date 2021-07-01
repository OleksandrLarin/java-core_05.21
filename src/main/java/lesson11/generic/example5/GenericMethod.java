package lesson11.generic.example5;

public class GenericMethod {
    public static <T> T printInfo(T t) {
        System.out.println(t);
        return t;
    }
}
