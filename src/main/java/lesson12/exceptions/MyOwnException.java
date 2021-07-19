package lesson12.exceptions;

public class MyOwnException extends RuntimeException {
    private final String myOnnMessage;

    public MyOwnException(String myOnnMessage) {
        super(myOnnMessage);
        this.myOnnMessage = myOnnMessage;
    }

    public String getMyOnnMessage() {
        return myOnnMessage;
    }
}
