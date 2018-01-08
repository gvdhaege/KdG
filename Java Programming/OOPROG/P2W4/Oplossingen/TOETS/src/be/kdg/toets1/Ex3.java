package be.kdg.toets1;

/**
 * @author Kristiaan Behiels
 * @version 1.0 15/11/13
 */
public class Ex3 {
    public static void main(String[] args) {
        try {
            division();
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void division() throws RuntimeException {
        try {
            double value = 100;
            int zero = (int)value / 0;
        }
        catch(ArithmeticException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
