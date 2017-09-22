package HogerLager;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 19:03
 */
public class HogerLager {

//    public static void main(String[] args) {
//        int teZoekenGetal = 99;
//        int gok;
//        int teller = 0;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        do {
//            System.out.print("Geef een getal: ");
//            gok = keyboard.nextInt();
//            teller++;
//
//            if (gok < teZoekenGetal) {
//                System.out.print("Te klein! ");
//            } else if (gok > teZoekenGetal) {
//                System.out.print("Te groot! ");
//            }
//
//        } while (gok != teZoekenGetal);
//        System.out.println("Proficiat, u hebt het geraden na " + teller + " gokken.");
//    }

//    public static void main(String[] args) {
//        int teZoekenGetal = 99;
//        int gok;
//        int teller = 0;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        do {
//            System.out.print("Geef een getal: ");
//            gok = keyboard.nextInt();
//            teller++;
//
//            if (gok == teZoekenGetal) {
//                System.out.println("Proficiat, u hebt het geraden na " + teller + " gokken.");
//            } else if (gok < teZoekenGetal) {
//                System.out.print("Te klein! ");
//            } else {
//                System.out.print("Te groot! ");
//            }
//
//        } while (gok != teZoekenGetal);
//    }

    public static void main(String[] args) {
        int teZoekenGetal = 99;
        int gok;
        int teller = 0;

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Geef een getal: ");
            gok = keyboard.nextInt();
            teller++;
            if (gok == teZoekenGetal) {
                System.out.println("Proficiat, u hebt het geraden na " + teller + " gokken.");
                return;
            }
            if (gok < teZoekenGetal) {
                System.out.print("Te klein! ");
            }
            if (gok > teZoekenGetal) {
                System.out.print("Te groot! ");
            }

        }
    }
}