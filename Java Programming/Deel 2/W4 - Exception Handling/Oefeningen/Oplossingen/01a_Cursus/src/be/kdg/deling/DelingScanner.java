package be.kdg.deling;

import java.util.Scanner;

public class DelingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");
        int deeltal = scanner.nextInt();
        System.out.print("Geef het tweede getal: ");
        int deler = scanner.nextInt();

        int quotiënt = deeltal / deler;
        System.out.println(deeltal + "/" + deler + " = " + quotiënt) ;
    }
}
