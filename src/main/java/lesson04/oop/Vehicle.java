package lesson04.oop;

public class Vehicle {
    private String model;
    private String type;

    public void info() {
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setType(String newType) {
        type = newType;
    }
}
