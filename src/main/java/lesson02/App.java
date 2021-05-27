package lesson02;

public class App {
    public static void main(String[] args) {
        String name = "Vlad";
        if (name.contains("a")) {
            System.out.println(name);
        } else {
            System.out.println("There is no \"A\" char");
        }

        int age = 15;

        if (age < 3) {
            System.out.println("Baby");
        } else if (age <16) {
            System.out.println("Child");
        } else {
            System.out.println("Adult");
        }
    }
}
