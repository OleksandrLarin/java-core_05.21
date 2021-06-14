package lesson06.oop.absctract.example3;

public abstract class Mammal extends Animal {
    @Override
    public void sleep() {
        System.out.println("Sleep");
    }

    public abstract void eat();

}
