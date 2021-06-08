package lesson05.oop.polymorphism.rules;

public class ReturnTypeExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal newAnimal = animal.createNewAnimal();
        newAnimal.say("Animal");


        Animal cat = new Cat();
        Animal newCat = cat.createNewAnimal();
        Cat newCat2 = new Cat().createNewAnimal();
        newCat.say("Cat");
    }
}
