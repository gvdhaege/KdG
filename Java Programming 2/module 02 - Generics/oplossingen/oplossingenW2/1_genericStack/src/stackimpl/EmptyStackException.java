package stackimpl;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException() {
        this("Stack is full");
    }

    public EmptyStackException(String message) {
        super(message);
    }
}
