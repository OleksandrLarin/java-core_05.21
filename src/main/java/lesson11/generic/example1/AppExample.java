package lesson11.generic.example1;

import java.util.ArrayList;
import java.util.List;

public class AppExample {
    public static void main(String[] args) {
        User user1 = new User("Jack", "jk@email.com");
        User user2 = new User("John", "jn@email.com");
        User user3 = new User("Micky", "mc@email.com");

        List users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        AppExample appExample = new AppExample();
        users.add("Nick");
        User john = appExample.getUserByName(users, "Nick");
        System.out.println(john);

    }

    public User getUserByName(List users, String name) {
        for (Object item : users) {
            if (item instanceof User){
                User user = (User) item;
                if (name.equals(user.getName())) {
                    return user;
                }
            }
        }
        return null;
    }
}
