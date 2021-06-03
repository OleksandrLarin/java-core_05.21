package lesson04.strings;

public class StringBuilderCapacityExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(20);

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());

        stringBuilder.append("some string");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());


        stringBuilder.append("one more string");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
    }
}
