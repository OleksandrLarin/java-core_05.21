package lesson05.oop.polymorphism;

public class App {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Worker programmer = new Programmer();
        Worker manager = new Manager();

        doWork(worker);
        doWork(programmer);
        doWork(manager);
    }

    public static void doWork(Worker worker) {
        worker.work();
    }
}
