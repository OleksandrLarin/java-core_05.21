package lesson09.collection.hashCode;

public class HashCodeExample {
    public static void main(String[] args) {
        Car car = new Car("X5", 2010);
        Car car1 = new Car("X3", 2015);
        Car car2 = new Car("X5", 2010);

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
