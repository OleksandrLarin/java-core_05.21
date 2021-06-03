package lesson04.oop.inheritence;


public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.move();
        car.move();

        BmwCar bmwCar = new BmwCar();
        bmwCar.move();
        bmwCar.movingFast();


        System.out.println(car.model);
        System.out.println(bmwCar.model);
    }
}
