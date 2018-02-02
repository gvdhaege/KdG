package be.kdg;

import be.kdg.omzetting.LettersNaarGetal;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
In de main methode van van de klasse lees je via een do-while lus getallen in letters in tot ineens <Enter> gegeven wordt.
*/
public class TestLettersNaarGetal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;
        do {
            System.out.print("Geef een geheel getal in letters (max 18 cijfers), stop met <Enter>: ");
            string = scanner.nextLine();
            if (!string.isEmpty()) {
               System.out.println("Getal: " + LettersNaarGetal.zetOmNaarGetal(string));
            }
        } while (string.isEmpty());
    }
}

/*
Geef een geheel getal in letters (max 18 cijfers), stop met <Enter>: drie zes zeven nul acht negen
Getal: 367089
Geef een geheel getal in letters (max 18 cijfers), stop met <Enter>: een drie zeven twee acht acht zeven vier negen nul vijf zes
Getal: 137288749056
Geef een geheel getal in letters (max 18 cijfers), stop met <Enter>:
*/
