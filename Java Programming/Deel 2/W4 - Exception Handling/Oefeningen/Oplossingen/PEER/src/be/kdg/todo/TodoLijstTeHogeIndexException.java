package be.kdg.todo;

/**
 * Created by venj on 29/11/2014.
 */
public class TodoLijstTeHogeIndexException extends  TodoLijstException {
    public  TodoLijstTeHogeIndexException(){
        super(ExceptionType.INVALIDINDEX, "Te hoge index opgegeven, er zijn niet zoveel TodoItems aanwezig ");
    }
}
