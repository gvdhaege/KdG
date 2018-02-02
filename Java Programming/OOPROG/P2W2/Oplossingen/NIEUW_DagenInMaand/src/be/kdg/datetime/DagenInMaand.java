package be.kdg.datetime;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014 21:16
 *
 * Gebruik uitsluitend methoden uit de DateTime API.
 */
public class DagenInMaand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een jaartal: ");
        if (scanner.hasNextInt()) {
            int jaartal = scanner.nextInt();
            LocalDate date = LocalDate.of(jaartal, 1, 1);
            int jaar = date.getYear();
            System.out.println("Jaar: " + jaar);
            for (int i = 0; i < 12; i++) {
                String maandNaam = date.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
                int aantalDagen = date.getMonth().maxLength();
                if (aantalDagen == 29 && !date.isLeapYear()) aantalDagen--;
                System.out.printf("%-9s %d%n", maandNaam, aantalDagen);
                date = date.plusMonths(1);
            }
        } else {
            System.out.println("Geen geldig jaartal!");
        }
    }
}

/*
Jaar: 2014
januari   31
februari  28
maart     31
april     30
mei       31
juni      30
juli      31
augustus  31
september 30
oktober   31
november  30
december  31
 */

/*
Jaar: 2016
januari   31
februari  29
maart     31
april     30
mei       31
juni      30
juli      31
augustus  31
september 30
oktober   31
november  30
december  31
 */
