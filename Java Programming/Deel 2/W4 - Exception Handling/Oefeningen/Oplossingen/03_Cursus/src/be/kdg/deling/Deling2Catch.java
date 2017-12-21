package be.kdg.deling;

import java.util.Scanner;

public class Deling2Catch {
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
        catch(NumberFormatException ex) {
            System.out.println("Foutief getal!");
        }
        catch(ArithmeticException ex) {
            System.out.println("Deling door nul!");
        }
        System.out.println("Einde");
    }
}
