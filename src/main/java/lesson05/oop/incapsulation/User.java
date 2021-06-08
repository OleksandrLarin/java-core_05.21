package lesson05.oop.incapsulation;

import java.util.Base64;

public class User {
    private String name;
    private int age;
    private String password = "qwerty";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        StringBuilder sb = new StringBuilder();
        sb.append("USER INFO: ")
                .append("\n")
                .append("Name: ")
                .append(name)
                .append("\n")
                .append("Age: ")
                .append(age);
        System.out.println(sb);
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public String getPassword() {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
}
