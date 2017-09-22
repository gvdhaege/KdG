package Sommeren;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 18:28
 */
public class Sommeren {
    public static void main(String[] args) {
        int getal;
        int som = 0;
        int teller = 0;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Geef een getal in: ");
            getal = keyboard.nextInt();
            som = som + getal;
            teller++;
        }
        while (getal != 0);
        System.out.println("De totale som is: " + som);
        System.out.println("Het totaal aantal ingegeven getallen is: " + teller);
        System.out.println("Einde programma!");

    }
}
