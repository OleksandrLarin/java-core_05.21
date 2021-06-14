package lesson06.oop.absctract.example;

public class TopManager extends Manager{
    @Override
    public void login(String login, String password) {
        System.out.println("Top Manager is logged in");

    }
}
