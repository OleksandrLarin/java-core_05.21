package lesson06.oop.absctract.example;

public class Manager extends User{
    @Override
    public void login(String login, String password) {
        System.out.println("Manager is logged in");
    }
}
