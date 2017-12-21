package be.kdg.todo;

/**
 * Created by venj on 29/11/2014.
 */
public class TodoLijstVolException extends TodoLijstException{
    public TodoLijstVolException(){
        super (ExceptionType.FULL, "Het maximum aantal elementen in de TodoLijst is bereikt");
    }
}
