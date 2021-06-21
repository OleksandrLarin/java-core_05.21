package lesson09.collection.stack;

public class App {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        if (stack.isEmpty()) {
            stack.push("First element");
            stack.push("Second element");
        }

        System.out.println(stack.pop());
    }
}
