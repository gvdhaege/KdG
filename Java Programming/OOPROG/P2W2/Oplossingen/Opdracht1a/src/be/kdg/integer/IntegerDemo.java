package be.kdg.integer;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 *
 * Tweede bullet p.152
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een geheel getal: ");
        int decimaal = scanner.nextInt();
        System.out.println();

        System.out.printf("%-16s: %d\n", "Decimal", decimaal);
        System.out.printf("%-16s: %s\n", "Binary", Integer.toBinaryString(decimaal));
        System.out.printf("%-16s: %s\n", "Hexadecimal", Integer.toHexString(decimaal));
        System.out.printf("%-16s: %s\n", "Octal", Integer.toOctalString(decimaal));

        /*
        System.out.println("Decimaal: " + Integer.parseInt("142857"));
        System.out.println("Binair: " + Integer.parseInt("100010111000001001", 2));
        System.out.println("Hexadecimaal: "+ Integer.parseInt("22E09", 16));
        System.out.println("Octaal: " + Integer.parseInt("427011", 8));
        */
    }
}

/*
Geef een geheel getal: 142857

Decimal         : 142857
Binary          : 100010111000001001
Hexadecimal     : 22e09
Octal           : 427011
*/