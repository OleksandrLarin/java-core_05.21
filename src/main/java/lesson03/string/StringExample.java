package lesson03.string;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "string";
        String string2 = new String("string");
        char[] chars = {'s', 't', 'r', 'i', 'n', 'g'};
        String string3 = new String(chars);
        String emptyString = "";

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(emptyString);

        System.out.println(string1.equals(string2));
    }
}
