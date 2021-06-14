package lesson06.oop;

public class App {
    public static void main(String[] args) {
        Worker worker;
        if (true) {
            worker = new Manager();
        } else {
            worker = new Worker();
        }
        doWork(worker);
        String str = printMessage("Jack");
    }

    public static void doWork(Worker worker) {
        worker.work();
    }

    public static void printMessage() {
        System.out.println("Message");
    }

    public static String printMessage(String name) {
        System.out.println("Hello " + name);

        return "";
    }
}
