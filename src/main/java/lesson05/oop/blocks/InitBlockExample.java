package lesson05.oop.blocks;

public class InitBlockExample {

    private String fieldName;

    public static void main(String[] args) {
        InitBlockExample initBlockExample = new InitBlockExample();
        System.out.println("Field name: " + initBlockExample.fieldName);
        System.out.println("===========================");
        InitBlockExample initBlockExample1= new InitBlockExample("Constructor with param is invoked");
        System.out.println("Field name: " + initBlockExample1.fieldName);

    }

    {
        System.out.println("Init block 1 is invoked");
    }

    {
        System.out.println("Init block 2 is invoked");
        fieldName = "Block 2";
    }

    public InitBlockExample() {
        System.out.println("Default constrictor is invoked");
    }

    public InitBlockExample(String msg) {
        System.out.println(msg);
        fieldName = msg;
    }
}
