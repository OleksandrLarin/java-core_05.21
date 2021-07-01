package lesson11.generic.example8;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        Container<Car> carContainer = new Container<>(car);
//        Container<String> stringContainer = new Container<>("");

        Container<? extends Vehicle> vehicleContainer = carContainer;

    }
}
