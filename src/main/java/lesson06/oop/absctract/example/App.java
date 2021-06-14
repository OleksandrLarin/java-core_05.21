package lesson06.oop.absctract.example;

public class App {
    public static void main(String[] args) {
        login(new Admin(), "54564654", "pass");
    }

    public static void login(User user, String login, String pass) {
        user.login(login, pass);
    }
}
