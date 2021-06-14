package lesson06.oop.interfaceExample;

public class Bird extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public String getName() {
        return null;
    }
}
