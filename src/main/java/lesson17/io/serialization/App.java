package lesson17.io.serialization;

import java.io.File;

public class App {
    public static void main(String[] args) {
        Serializator serializator = new Serializator();
        Deserializator deserializator = new Deserializator();
        File file = new File("src/main/resources/lesson17/user.obj");
        User user = buildNewUser("John");

        serializator.serialize(user, file);

        User deserializedUser = (User) deserializator.deserialize(file);
        System.out.println(deserializedUser);
    }

    private static User buildNewUser(String name) {
        User user = new User();
        user.setName(name);
        user.setEmail(name + "@mail.com");
        user.setAge(20);
        user.setPassword(name + user.getAge());
        return user;
    }
}
