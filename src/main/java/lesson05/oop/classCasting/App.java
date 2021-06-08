package lesson05.oop.classCasting;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Vehicle carVehicle = new Car();

        vehicle.move();

        car.drive();
        car.move();

        carVehicle.move();

        Car bmw = (Car) carVehicle;
        bmw.move();
        bmw.drive();

        // ClassCastException
//        bmw = (Car) new Object();
    }
}
