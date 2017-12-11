package main.java.com.sg.exception;

public class ItemValidationException extends Exception{
    public ItemValidationException(String message) {
        super(message);
    }

    public ItemValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
