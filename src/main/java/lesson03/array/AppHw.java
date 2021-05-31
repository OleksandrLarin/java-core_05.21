package lesson03.array;

public class AppHw {
    public static void main(String[] args) {
        System.out.print("#10 Simple: ");


        boolean simple;
        int start = 2;

        if (start == 2) {
            System.out.println(2);
        }
        for (int i = 3; i <= 1_000_000; i+=2) {
            simple = true;
            for (int x = 2; x <= Math.sqrt(i); x++) {
                if ((i % x) == 0)
                    simple = false;
            }
            if (simple == false) continue;
            System.out.print(i + ",");
        }
    }
}
