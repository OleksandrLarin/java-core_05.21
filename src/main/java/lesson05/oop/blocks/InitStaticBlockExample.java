package lesson05.oop.blocks;

public class InitStaticBlockExample {
    public static void main(String[] args) {
        System.out.println("Hello");
        InitStaticBlockExample staticBlockExample = new InitStaticBlockExample();
        InitStaticBlockExample staticBlockExample2 = new InitStaticBlockExample();
    }

    {
        System.out.println("Dynamic block C");
    }

    static {
        System.out.println("Static block B");
    }

    {
        System.out.println("Dynamic block");
    }

        public InitStaticBlockExample() {
            System.out.println("Default Constructor");
        }


    static {
        System.out.println("Static block A");
    }

}
