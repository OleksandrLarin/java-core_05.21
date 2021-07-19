package lesson12.exceptions;

public class ExceptionExample {
    public int divide(int a, int b) {
        int result;
        try {
            result = a / b;
            System.out.println("Result calculated.");
        } catch (ArithmeticException e) {
            System.out.println("Catch block: ");
            System.out.println(e.getMessage());
            return a * b;
        } catch (RuntimeException e) {
            return 0;
        } catch (Exception e) {
            return -1;
        } finally {
            System.out.println("Block 'Finally'!");
        }
        return result;
    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        int result = example.divide(12, 0);
        System.out.println(result);
    }
}
