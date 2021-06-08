package lesson05.oop.incapsulation;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(25);

        user.info();

        user.setAge(-20);

        user.info();

        System.out.println(user.getPassword());
    }
}
