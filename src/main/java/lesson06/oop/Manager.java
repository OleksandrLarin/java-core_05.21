package lesson06.oop;

public class Manager extends Worker{
    @Override
    public void work() {
        System.out.println("Manager");
    }

    public static void info() {
        System.out.println("Manager");
    }
}
