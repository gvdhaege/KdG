/**
 * Created by venj on 29/10/2014.
 */
public class ExceptionsInpakkenDemo {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (MyException ex) {
            System.out.println(ex.toString());
        }

        try {
            multipleExceptions();
        } catch (RuntimeException ex) {
            System.out.println(ex.toString());
        }
    }

    private static void doSomething() throws MyException {
        try {
            throw new IndexOutOfBoundsException("Ik heb iets fout gedaan");
        } catch (Exception ex) {
            throw new MyException("Oh nee, iets fout", ex);
        }
    }

    private static void multipleExceptions() throws IndexOutOfBoundsException, ArithmeticException {
        try {
            //This code generates some exceptions
            throw new IndexOutOfBoundsException("Kan dit?");
        } catch (RuntimeException ex) {
            //Do something (eg.: write to a specific logfile)
            throw ex;
        }
    }
}
