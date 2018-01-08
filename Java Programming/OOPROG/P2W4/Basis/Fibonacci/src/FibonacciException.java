public class FibonacciException extends ArithmeticException {

    public FibonacciException(int n) {
        if (n < 0) {
            System.out.println("Negatieve waarden zijn uitgesloten!");
        } else {
            System.out.println("De maximale waarde voor type long werd overschreden!");
        }
    }
}
