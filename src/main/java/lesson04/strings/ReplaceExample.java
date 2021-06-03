package lesson04.strings;

public class ReplaceExample {
    public static void main(String[] args) {
        String str = "prefix_stringst";

        System.out.println(str.replace("i", "o"));
        System.out.println(str.replace("s", "b").replace("r", "o").replace("n", "m"));
        System.out.println(str.replace("st", ""));
        System.out.println(str);


        int indexOfSymbol = str.indexOf("s");
        System.out.println(str.substring(0, indexOfSymbol) + str.substring(indexOfSymbol + 1));

        System.out.println(str.replace('i', 'a'));
    }
}
