package lesson04.oop.constructor;

public class Car {
    private String name;
    private String model;
    private int year;

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public Car(int year, String carName, String model) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public Car(String carName, String model) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public Car() {
        this.name = "default name";
        this.model = "default model";
        this.year = 2000;
    }

    public Car(Car fromCar) {
        this.name = fromCar.getName();
        this.model = fromCar.getModel();
        this.year = fromCar.getYear();
    }

    public void info() {
        System.out.println(name + " " + model);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
