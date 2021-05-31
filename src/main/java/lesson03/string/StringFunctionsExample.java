package lesson03.string;

public class StringFunctionsExample {
    public static void main(String[] args) {
        String str = "String";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("str"));
        System.out.println(str.startsWith("Str"));
        System.out.println(str.endsWith("ng"));
        System.out.println(str.endsWith("ng"));
        System.out.println(str.contains("rin"));
        System.out.println(str.indexOf("rin"));
        System.out.println(String.valueOf(5.5));
        System.out.println(Long.toString(123L));
    }
}
