package lesson06.oop.absctract.example;

public class Customer extends User{
    @Override
    public void login(String login, String password) {
        System.out.println("Customer is logged in");
    }
}
