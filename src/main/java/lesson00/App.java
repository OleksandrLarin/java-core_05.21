package lesson00;/*
многострочный
комментарий
.
 */

/**
 * Main class App.java
 *
 * @author Oleksandr_Larin
 */
public class App {
    private static final String APPLICATION_NAME = "dfvd";

    public static void main(String[] args) {
//        System.out.println("Hello\t'World!'"); //выводит в консоль Hello 'World!'
//        MathCalc.sum(9, 4);
//        int count = 5;
//        System.out.println(--count); //4
//        System.out.println(count--); //4
//        System.out.println(-count); //-3
//        System.out.println(+count); //3
//        System.out.println("odd " + (5%2 !=0) );
        greeting("First Name", "Last Name");
    }

    public static void greeting(String name, String secondName) {
        int a = 25;
        System.out.println("Hello " + name + " " + secondName);
    }
}
