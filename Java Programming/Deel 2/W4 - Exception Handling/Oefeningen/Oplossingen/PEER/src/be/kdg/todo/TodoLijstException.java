package be.kdg.todo;

/**
 * User: vochtenh
 * Date: 2-12-13 16:21
 * User: venjoha
 * Date: 29-11-14 (review and adjustments for AJ1415)
 */
public class TodoLijstException extends Exception {
    private ExceptionType exceptionType;

    public TodoLijstException(ExceptionType type, String message){
        super(message);
        exceptionType = type;
    }

    @Override
    public String getMessage(){
        return exceptionType.name() + ": " + super.getMessage();
    }

    public enum ExceptionType{
        UNDEFINED,
        EMPTY,
        FULL,
        INVALIDINDEX
    }
}



