package be.kdg.deling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/11/13
 */
public class DelingMultiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");
        try {
            int deeltal = Integer.parseInt(scanner.nextLine());
            System.out.print("Geef het tweede getal: ");
            // int deler = Integer.parseInt(scanner.nextLine());
            int deler = scanner.nextInt();
            int quotiënt = deeltal / deler;
            System.out.println(deeltal + "/" + deler + " = " + quotiënt) ;
        }
        catch(NumberFormatException | ArithmeticException ex) {
            System.out.println("Er ging iets mis!");
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        System.out.println("Einde");
    }
}
