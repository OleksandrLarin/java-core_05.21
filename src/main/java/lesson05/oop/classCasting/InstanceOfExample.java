package lesson05.oop.classCasting;

public class InstanceOfExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.drive();
        } else {
            vehicle.move();
        }

        Car car = new Car();
        if (car instanceof Object) {
            car.move();
        } else {
            car.drive();
        }
    }
}
