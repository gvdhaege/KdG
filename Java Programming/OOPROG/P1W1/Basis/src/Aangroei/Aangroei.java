package Aangroei;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 20:18
 */
public class Aangroei {

    public static void main(String[] args) {
        int teller = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef het huidig aantal inwoners: ");
        double aantalInwoners = keyboard.nextInt();

        System.out.print("Geef het aantal jaren: ");
        int aantalJaren = keyboard.nextInt();

        System.out.print("Geef jaarlijkse groei in procent: ");
        int aangroei = keyboard.nextInt();
        double aangroeiPercentage = (double) aangroei / 100;

        System.out.printf("Huidig aantal: %.0f\n", aantalInwoners);

        while (teller < aantalJaren) {
            teller++;
            aantalInwoners = aantalInwoners + (aantalInwoners * aangroeiPercentage);
            System.out.printf("Aantal na %d jaren: %.0f\n", teller, aantalInwoners);
        }
    }
}
