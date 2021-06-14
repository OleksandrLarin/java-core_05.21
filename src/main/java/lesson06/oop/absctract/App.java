package lesson06.oop.absctract;

public class App {
    public static void main(String[] args) {
        AbstractClassExample abstractClass = new NonAbstractClassExample();

        System.out.println(abstractClass.hello("Jack"));
    }
}
