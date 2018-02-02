package be.kdg.benchmark;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */
public class RunBenchmark {
    private static String duplicateString(String s, int times) {
        String result = s;
        long time = System.nanoTime();
        for (int i = 1; i < times; i++) {
            result = result + s;
        }
        System.out.println((System.nanoTime() - time) / 1000000.0 + " ms");
        return result;
    }

    private static String duplicateStringOperator(String s, int times) {
        String result = s;
        long time = System.nanoTime();
        for (int i = 1; i < times; i++) {
            result += s;
        }
        System.out.println((System.nanoTime() - time) / 1000000.0 + " ms");
        return result;
    }

    private static String duplicateBuffer(String s, int times) {
        StringBuffer result  = new StringBuffer();
        long time = System.nanoTime();
        for (int i = 1; i < times; i++) {
            result.append(s);
        }
        System.out.println((System.nanoTime() - time) / 1000000.0 + " ms");
        return result.toString();
    }

    private static String duplicateBuilder(String s, int times) {
        StringBuilder result  = new StringBuilder();
        long time = System.nanoTime();
        for (int i = 1; i < times; i++) {
            result.append(s);
        }
        System.out.println((System.nanoTime() - time) / 1000000.0 + " ms");
        return result.toString();
    }

    private static String duplicate(String s, int times) {
        int size = s.length() * times;
        StringBuilder result  = new StringBuilder(size);
        long time = System.nanoTime();
        for (int i = 0; i < times; i++) {
            result.append(s);
        }
        System.out.println((System.nanoTime() - time) / 1000000.0 + " ms");
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aantal keer: ");
        int times = scanner.nextInt();

        String string = "Hello";
        duplicateString(string, times);
        duplicateStringOperator(string, times);
        duplicateBuffer(string, times);
        duplicateBuilder(string, times);
        duplicate(string, times);
    }
}

/*
Aantal keer: 10000
585.069469 ms
353.321946 ms
0.959031 ms
0.551369 ms
0.479149 ms
*/

/*
Aantal keer: 100000
14014.432025 ms
13797.363984 ms
8.137467 ms
5.356424 ms
5.071573 ms
*/