package lesson05.oop.inheritance.one;

public class NotChildClassExample {
    public static void main(String[] args) {
        ChildClassExample childClassExample = new lesson05.oop.inheritance.one.ChildClassExample();

        childClassExample.defaultMethod();
        childClassExample.protectedMethod();
        childClassExample.publicMethod();

    }
}
