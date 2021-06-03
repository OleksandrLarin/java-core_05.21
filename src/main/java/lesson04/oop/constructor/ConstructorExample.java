package lesson04.oop.constructor;

public class ConstructorExample {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "X5", 1999);
        bmw.info();

        Car emptyCar = new Car();
        emptyCar.info();

        Car copyBmw = new Car(bmw);
        copyBmw.info();
    }
}
