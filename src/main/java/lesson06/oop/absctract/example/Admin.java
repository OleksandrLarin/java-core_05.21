package lesson06.oop.absctract.example;

public class Admin extends User {
    @Override
    public void login(String login, String password) {
        long id = Long.parseLong(login);
        System.out.println("Id: " + id);
    }
}
