package be.kdg.todo;

/**
 * Created by venj on 29/11/2014.
 */
public class TodoLijstLeegException extends  TodoLijstException {
    public TodoLijstLeegException() {
        super(ExceptionType.EMPTY, "Er zijn géén elementen in de TodoLijst");
    }
}
