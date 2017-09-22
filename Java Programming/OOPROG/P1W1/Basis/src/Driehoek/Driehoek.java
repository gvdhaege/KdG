package Driehoek;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 20:37
 */
public class Driehoek {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de hoogte in: ");
        int input = keyboard.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%3d", 42);
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Geef de hoogte in: ");
//        int hoogte = keyboard.nextInt();
//
//        int aantalRegels = 0;
//        int getal = 42;
//        while (aantalRegels < hoogte) {
//            int count = 0;
//            aantalRegels = aantalRegels + 1;
//            while(count < aantalRegels) {
//                System.out.print(getal + " ");
//                count = count + 1;
//            }
//            System.out.println();
//        }
//    }
//}
}
