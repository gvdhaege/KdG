package be.kdg.toets1;

/**
 * @author Kristiaan Behiels
 * @version 1.0 15/11/13
 */
public class Ex1 {
    public static void main(String[] args) {
        try {
           double value = 100;
           int zero = (int)value / 0;
        }
        catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex);
        }
        finally {
            System.out.println("Einde");
        }
    }
}
