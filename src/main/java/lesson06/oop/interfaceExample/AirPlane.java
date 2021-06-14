package lesson06.oop.interfaceExample;

public class AirPlane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public String getName() {
        return null;
    }
}
