package lesson20.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("ff");
        runnable.run();
    }
}
