import java.util.InputMismatchException;

/**
 * Created by venj on 29/10/2014.
 */
public class ExceptionsThrowenDemo {
    public static void main(String[] args) {
        doSomethingWrong();
        try {
            throwAnException();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        throwAnUncheckedException();
    }

    private static int doSomethingWrong() {
        return 5 / 0;
    }

    private static void throwAnException() throws Exception{
        throw new Exception("Heleba!");
    }

    private static void throwAnUncheckedException() {
        throw new IndexOutOfBoundsException("Leer eens programmeren!");
    }
}
