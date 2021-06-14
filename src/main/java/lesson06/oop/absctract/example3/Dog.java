package lesson06.oop.absctract.example3;

public class Dog extends Mammal {
    @Override
    public void move() {
        System.out.println("Move");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }
}
