package Leeftijd;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 18:24
 */
public class Leeftijd {

    public static void main(String[] args) {
        String naam;
        int geboorteJaar;
        int huidigJaar = 2017;
        int leeftijd;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Hoe heet je: ");
        naam = keyboard.nextLine();
        System.out.print("In welk jaar ben je geboren? ");
        geboorteJaar = keyboard.nextInt();
        leeftijd = huidigJaar - geboorteJaar;
        System.out.print(naam + ", je wordt dit jaar " + leeftijd + ".");
    }
}
