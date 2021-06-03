package lesson04.oop;

public class ClassExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("Model S");
        vehicle.setType("Car");

        vehicle.info();

        Vehicle emptyVehicle = new Vehicle();
        emptyVehicle.info();
    }
}
