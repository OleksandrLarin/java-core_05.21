package lesson06.oop.interfaceExample;

public class App {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();
        Bird bird = new Bird();

        fly(bird);
        fly(airPlane);
    }

    public static void fly(Flyable flyable) {
        flyable.info();
        flyable.fly();
    }

}
