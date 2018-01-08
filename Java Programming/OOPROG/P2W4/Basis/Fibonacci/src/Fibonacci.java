public class Fibonacci {
    private static final long MAX = 91;

    public static long fibonacciGetal(int n) throws FibonacciException {
        long eerste = 0;
        long tweede = 1;
        long getal = 0;

        if (n < 0 || n > MAX){
            throw new FibonacciException(n);
        }

        for (int i = 0; i < n; i++) {
            getal = eerste + tweede;
            eerste = tweede;
            tweede = getal;
        }
        return getal;
    }
}
