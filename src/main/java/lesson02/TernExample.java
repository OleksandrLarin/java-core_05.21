package lesson02;

public class TernExample {
    public static void main(String[] args) {
        int day = 2;

        String message = day <= 5 ? "Working day" : "Weekend"; //?:

        if (day <=5) {
            message = "Working day";
        } else {
            message = "Weekend";
        }

        System.out.println(message);

        if (day <= 5) {
            System.out.println("Working day");
        } else {
            System.out.println("Weekend");
        }
    }
}
