package lesson05.oop.polymorphism.rules;

public class Cat extends Animal {

    @Override
    public Cat createNewAnimal() {
        return new Cat();
    }

    @Override
    public void say(String name) {
        super.say(name);
        System.out.println("I'm a cat");
    }
}
