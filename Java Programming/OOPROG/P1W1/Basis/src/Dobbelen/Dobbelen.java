package Dobbelen;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 20:47
 */
public class Dobbelen {

    public static void main(String[] args) {
        int count = 0;
        int totaal = 0;

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Hoeveel maal wil je werpen? : ");
        int aantalWorpen = keyboard.nextInt();

        while (count < aantalWorpen) {
            int dobbelsteen1 = random.nextInt(6) + 1;
            int dobbelsteen2 = random.nextInt(6) + 1;
            int dobbelsteen3 = random.nextInt(6) + 1;
            int somWorp = dobbelsteen1 + dobbelsteen2 + dobbelsteen3;
            System.out.println(dobbelsteen1 + " + " + dobbelsteen2 + " + " + dobbelsteen3 + " = " + somWorp);
            totaal += somWorp;
            count++;
        }
        double gemiddelde = totaal / aantalWorpen;
        System.out.println("Totale som: " + totaal);
        System.out.println("Gemiddelde: " + gemiddelde);

    }


    /*



     */

    <!-- -->
}
