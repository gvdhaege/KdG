package be.kdg;

import be.kdg.zin.Zin;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
In de main methode herhaal je een do-while lus tot er meteen <enter> gegeven wordt.
Als je een zin ingeeft wordt het aantal woorden en de zin met de woorden in omgekeerde volgorde afgedrukt.
Zie voorbeeld van uitvoer.
 */
public class TestZin {
    public static void main(String[] args) {                   
        Scanner scanner = new Scanner(System.in);

        boolean nog = true;
        do {
            System.out.print("\nGeef een zin in (stop met onmiddellijk <enter> te geven): ");
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                nog = false;
            } else {
                Zin zin = new Zin(string);
                System.out.println("Aantal woorden: " + zin.aantalWoorden());
                zin.keerOm();
                System.out.println("Zin met de woorden in omgekeerde volgorde: " + zin);
            }
        } while (nog);

    }
}

/*
Geef een zin in (stop met onmiddellijk <enter> te geven): de volgorde is omgekeerd nu
Aantal woorden: 5
Zin met de woorden in omgekeerde volgorde: nu omgekeerd is volgorde de

Geef een zin in (stop met onmiddellijk <enter> te geven):
*/