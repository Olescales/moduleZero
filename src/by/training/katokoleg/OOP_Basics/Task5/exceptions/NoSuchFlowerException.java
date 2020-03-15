package exceptions;

public class NoSuchFlowerException extends Exception {

    public NoSuchFlowerException() {
    }

    public NoSuchFlowerException(String message) {
        super(message);
    }
}
