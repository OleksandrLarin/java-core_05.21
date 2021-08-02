package lesson19.reflection;

import java.lang.reflect.Constructor;

public class ConstructorExample {
    public static void main(String[] args) throws NoSuchMethodException {
        Constructor<?>[] constructors = Model.class.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getParameterCount());
        }
        System.out.println("Amount of constructors: " + constructors.length);
        Constructor<Model> constructor = Model.class.getConstructor(int.class, String.class);
        System.out.println(constructor.getParameterCount());


        System.out.println("Amount of declared constructors: " + Model.class.getDeclaredConstructors().length);

        Constructor<Model> constructor1 = Model.class.getDeclaredConstructor(String.class);
        System.out.println(constructor1.getParameterCount());
    }
}
