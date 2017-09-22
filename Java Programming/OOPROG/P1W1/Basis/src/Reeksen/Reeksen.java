package Reeksen;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 19:21
 */
public class Reeksen {

    public static void main(String[] args) {
        int aantal;
        int beginwaarde;
        int stapwaarde;
        int teller = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil je afdrukken? ");
        aantal = keyboard.nextInt();
        System.out.print("Met welke waarde wil je starten? ");
        beginwaarde = keyboard.nextInt();
        System.out.print("Met welke waarde wil je verhogen? ");
        stapwaarde = keyboard.nextInt();

        while (teller < aantal) {
            System.out.println(beginwaarde);
            beginwaarde += stapwaarde;
            teller++;
        }
    }
}
