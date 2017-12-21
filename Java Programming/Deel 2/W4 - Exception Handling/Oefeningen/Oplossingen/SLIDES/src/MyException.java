/**
 * Created by venj on 29/10/2014.
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public String toString() {
        return String.format("I'm\n'%s'\nand I'm caused by\n'%s'"
                                            , super.toString()
                                            , getCause().toString());
    }
}

