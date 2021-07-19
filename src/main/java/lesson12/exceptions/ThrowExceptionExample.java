package lesson12.exceptions;

import java.io.IOException;

public class ThrowExceptionExample {
    public static void main(String[] args) throws IOException {
//        throwException();

        throwCheckedException();
    }

    public static void throwException() {
        throw new RuntimeException("Error message");
    }

    public static void throwCheckedException() throws IOException {
        throw new IOException("Error message IOException");
    }
}
