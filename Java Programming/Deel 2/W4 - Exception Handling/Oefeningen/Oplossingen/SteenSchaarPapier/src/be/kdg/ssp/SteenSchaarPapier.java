package be.kdg.ssp;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SteenSchaarPapier {
    public static void main(String[] args) {
        final String[] opties = {"steen", "schaar", "papier"};

        final Scanner keyboard = new Scanner(System.in);
        boolean verdergaan = true;

        do {
            System.out.print("Steen, schaar of papier? (of stop) ");
            final String input = keyboard.nextLine().toLowerCase();

            int gebruikerKeuze = -1;

            switch (input) {
                case "stop":
                    verdergaan = false;
                    break;
                case "steen":
                    gebruikerKeuze = 0;
                    break;
                case "schaar":
                    gebruikerKeuze = 1;
                    break;
                case "papier":
                    gebruikerKeuze = 2;
                    break;
                default:
                    throw new InputMismatchException("Invoer is foutief.");
            }

            if (verdergaan) {
                int programmaKeuze = new Random().nextInt(3);

                System.out.println("Mijn keuze was " + opties[programmaKeuze] + ".");
                if (programmaKeuze == gebruikerKeuze) {
                    System.out.println("\tGelijkspel!");
                }
                else if ((programmaKeuze + 1) % 3 == gebruikerKeuze) {
                    System.out.println("\tIk win!");
                }
                else {
                    System.out.println("\tU wint, proficiat!");
                }
                System.out.println();
            }
        } while (verdergaan);
    }
}
