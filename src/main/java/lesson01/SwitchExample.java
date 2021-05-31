package lesson01;

public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Другой день недели");
                break;
        }

        switch (dayOfWeek) {
            default:
                System.out.println("Выходной");
                break;
            case 1:
            case 2:
                System.out.println("Любимый вторник");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Будни");
                break;
        }
    }
}
