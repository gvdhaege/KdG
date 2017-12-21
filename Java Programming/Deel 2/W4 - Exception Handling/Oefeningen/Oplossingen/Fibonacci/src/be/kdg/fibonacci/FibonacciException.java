package be.kdg.fibonacci;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/11/13
 */
public class FibonacciException extends ArithmeticException {
    public FibonacciException(int n) {
        if (n < 0) {
            System.out.println("Negatieve waarden zijn uitgesloten!");
        } else {
            System.out.println("De maximale waarde voor type long werd overschreden!");
        }
    }
}
