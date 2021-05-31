package lesson03.string;

public class StringTask {
    public static void main(String[] args) {
        String name = "Vasya";
        String lastName = "Petrov";

        String fullName = createFullName(name, lastName);
        String uid = createUID(name, lastName);

        System.out.println(fullName);
        System.out.println(uid);
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public static String createUID(String firstName, String lastName) {
        int length = firstName.length() + lastName.length();
        return firstName.toUpperCase() + "_" + lastName.toUpperCase() + "_" + length;
    }


}
