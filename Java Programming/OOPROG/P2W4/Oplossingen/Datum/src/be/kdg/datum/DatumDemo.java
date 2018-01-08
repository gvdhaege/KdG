package be.kdg.datum;

import be.kdg.datum.io.DateIOException;
import be.kdg.datum.util.Datum;

import java.util.Scanner;

/**
 * Testklasse voor Datum en DateIOException.
 * Breid deze code uit, zodat de DateIOException correct wordt afgehandeld
 * Test uit met een aantal data.
 */
public class DatumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        do {
            try {
                System.out.print("Geef een datum (dd/mm/jjjj): ");
                String str = scanner.nextLine();
                Datum datum = new Datum(str);
                System.out.println("korte datum: " + datum.getKorteDatum());
                System.out.println("lange datum: " + datum.getLangeDatum());
                correct = true;
            } catch (DateIOException de) {
                System.out.println(de.getMessage());
            }
        }
        while (!correct);
    }
}
