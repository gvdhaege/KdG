package be.kdg.finallydemo;

import java.util.Scanner;

public class DelingFinally {
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
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Einde");
        }
        System.out.println("Einde programma");
   }
}