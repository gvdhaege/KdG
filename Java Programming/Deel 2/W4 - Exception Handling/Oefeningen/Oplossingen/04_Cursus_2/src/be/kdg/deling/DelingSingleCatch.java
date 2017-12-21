package be.kdg.deling;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/11/13
 */
public class DelingSingleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");
        try {
            int deeltal = Integer.parseInt(scanner.nextLine());
            System.out.print("Geef het tweede getal: ");
            int deler = Integer.parseInt(scanner.nextLine());
            int quotiënt = deeltal / deler;
            System.out.println(deeltal + "/" + deler + " = " + quotiënt) ;
        }
        catch(RuntimeException ex) {
            System.out.println("Er ging iets mis!");
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        System.out.println("Einde");
    }
}
