package be.kdg.toets1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 15/11/13
 */
public class Ex2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Geef een getal: ");
            double getal = scanner.nextInt();
            System.out.println("getal = " + getal);
        }
        catch (InputMismatchException ex) {
            System.out.println("Dit is geen getal!");
        }
        catch (RuntimeException ex) {
            System.out.println("Foutieve invoer!");
        }
    }
}
