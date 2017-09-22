package Middelste;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 19:32
 */
public class Middelste {

    public static void main(String[] args) {
        int eerste;
        int tweede;
        int derde;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef het eerste getal in: ");
        eerste = keyboard.nextInt();
        if (eerste > 100 || eerste < 1) {
            System.out.println("Het getal moet tussen 1 en 100 liggen");
            return;
        }
        System.out.print("Geef het tweede getal in: ");
        tweede = keyboard.nextInt();
        if (tweede > 100 || tweede < 1) {
            System.out.println("Het getal moet tussen 1 en 100 liggen");
            return;
        }
        System.out.print("Geef het derde getal in: ");
        derde = keyboard.nextInt();
        if (derde > 100 || derde < 1) {
            System.out.println("Het getal moet tussen 1 en 100 liggen");
            return;
        }

        if (eerste > tweede && eerste < derde || eerste > tweede && eerste < derde){
            System.out.println(eerste);
        }
        if (tweede > eerste && tweede < derde || tweede > derde && tweede < eerste){
            System.out.println(tweede);
        }
        if (derde > tweede && derde < eerste || derde > eerste && derde < tweede){
            System.out.println(derde);
        }

        System.out.println("Einde programma!");
        return;
    }
}
