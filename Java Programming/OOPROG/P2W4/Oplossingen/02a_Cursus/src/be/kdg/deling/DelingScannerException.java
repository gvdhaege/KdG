package be.kdg.deling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/11/13
 */
public class DelingScannerException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");

        try {
        int deeltal = scanner.nextInt();
        System.out.print("Geef het tweede getal: ");
        int deler = scanner.nextInt();

        int quotiënt = deeltal / deler;
        System.out.println(deeltal + "/" + deler + " = " + quotiënt);
        }
        catch(InputMismatchException ex) {
            System.out.println("Foutief getal!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Einde");
    }
}
