package lesson06.oop.interfaceExample;

public interface Flyable extends I {
    void fly();

    default void info() {
        System.out.println("Info");
    }
}
