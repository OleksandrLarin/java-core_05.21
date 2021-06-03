package lesson04.strings;

public class SubstringExample {
    public static void main(String[] args) {
        String url = "http://www.google.com";
        System.out.println(url.substring(7));

        String url_2 = "http://www.google.com?search=itea";
        System.out.println(url_2.substring(7,21));
    }
}
