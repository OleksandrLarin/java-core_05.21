package lesson06.oop.absctract;

public class NonAbstractClassExample extends AbstractClassExample{
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
