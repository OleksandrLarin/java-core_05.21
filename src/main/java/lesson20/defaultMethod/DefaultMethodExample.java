package lesson20.defaultMethod;

public interface DefaultMethodExample {

    String getInfo();

    default void printInfo() {
        System.out.println("Default Method");
    }

}
