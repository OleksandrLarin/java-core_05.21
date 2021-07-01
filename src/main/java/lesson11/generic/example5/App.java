package lesson11.generic.example5;

public class App {
    public static void main(String[] args) {
        GenericType<String> genericType = new GenericType<>();
        genericType.printInfo("String");


        String str = GenericMethod.printInfo("new Object()");

        ComposedMethodAndType<Integer> composed = new ComposedMethodAndType<>();

        String[] strings = {"abc"};

        composed.print(15615);
        Integer integer = composed.printInfoNonStatic(strings);

        ComposedMethodAndType.printInfo(strings);
    }
}
