package lesson05.oop.inheritance;

import lesson05.oop.inheritance.one.ChildClassExample;
import lesson05.oop.inheritance.one.SuperClassExample;

public class InheritanceExample {
    public static void main(String[] args) {
        SuperClassExample superClassExample = new SuperClassExample();
        ChildClassExample childClassExample = new ChildClassExample();

        childClassExample.info();
    }
}
