package lesson05.oop.polymorphism.rules;

public class Animal {

    public Animal createNewAnimal() {
        return new Animal();
    }

    public void say(String name) {
        System.out.println("I'm " + name);
    }
}
