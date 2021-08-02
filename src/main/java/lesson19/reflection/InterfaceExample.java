package lesson19.reflection;

public class InterfaceExample {
    public static void main(String[] args) {


        Class<?>[] interfaces = String.class.getInterfaces();

        if (interfaces != null) {
            for (Class<?> interfaceClass : interfaces) {
                System.out.println(interfaceClass.getSimpleName());
            }
        }
    }
}
