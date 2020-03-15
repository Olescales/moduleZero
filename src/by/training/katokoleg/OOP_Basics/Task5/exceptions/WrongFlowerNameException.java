package exceptions;

public class WrongFlowerNameException extends Exception {
    public WrongFlowerNameException() {
    }

    public WrongFlowerNameException(String message) {
        super(message);
    }
}
