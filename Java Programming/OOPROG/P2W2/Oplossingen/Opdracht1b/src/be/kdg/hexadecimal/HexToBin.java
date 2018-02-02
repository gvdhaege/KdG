package be.kdg.hexadecimal;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 *
 * Eerste bullet p.153
 */
public class HexToBin {
    // private static String hexToBin(String s) {
    //    return new BigInteger(s, 16).toString(2);
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een hexadecimaal getal: ");
        String hexadecimaal = scanner.nextLine();

    //  String binair = hexToBin(hexadecimaal);
        int decimaal = Integer.parseInt(hexadecimaal, 16);
        String binair = Integer.toBinaryString(decimaal);
        System.out.printf("%s in binair is %s.\n", hexadecimaal, binair);

    }
}

/*
Geef een hexadecimaal getal: 22E09
22E09 in binair is 100010111000001001.
*/