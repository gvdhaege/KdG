package be.kdg.fibonacci;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/11/13
 */

/*
 Vul deze klasse aan zodat er op het juiste moment een FibonacciException geworpen wordt. 
 */
public class Fibonacci {
    private static final long MAX = 91;

    public static long finonacciGetal(int n) throws FibonacciException {
        long eerste = 0;
        long tweede = 1;
        long getal = 0;

        if (n < 0 || n > MAX) {
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
