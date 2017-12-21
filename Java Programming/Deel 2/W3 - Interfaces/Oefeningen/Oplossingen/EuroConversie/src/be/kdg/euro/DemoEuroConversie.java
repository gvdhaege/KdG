package be.kdg.euro;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class DemoEuroConversie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het bedrag: ");
        double bedrag = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Geef de euromunt (code): ");
        String munt = scanner.nextLine().toUpperCase();
        if (EuroConversie.isEuroMunt(munt)) {
            System.out.printf("%.2f %s = € %.2f\n", bedrag, munt,
                    EuroConversie.naarEuro(munt, bedrag));
            System.out.printf("€ %.2f = %.2f %s", bedrag,
                    EuroConversie.naarLokaleMunt(munt, bedrag),
                    EuroConversie.getOmschrijving(munt));
        } else {
            System.out.println("Error! Geen geldige muntcode.");
        }

    }
}

/*
Geef het bedrag: 1000
Geef de euromunt (code): NLG
1000,00 NLG = € 453,78
€ 1000,00 = 2203,71 Nederlandse gulden
*/

/*
Geef het bedrag: 1000
Geef de euromunt (code): dem
1000,00 DEM = € 511,29
€ 1000,00 = 1955,83 Duitse mark
*/

/*
Geef het bedrag: 1000
Geef de euromunt (code): bef
1000,00 BEF = € 24,79
€ 1000,00 = 40339,90 Belgische frank
*/

/*
Geef het bedrag: 1000
Geef de euromunt (code): GBP
Error! Geen geldige muntcode.
*/