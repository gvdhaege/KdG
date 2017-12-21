package be.kdg.deling;

import java.util.Scanner;

public class DelingParseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");
        int deeltal = Integer.parseInt(scanner.nextLine());
        System.out.print("Geef het tweede getal: ");
        int deler = Integer.parseInt(scanner.nextLine());

        int quotiënt = deeltal / deler;
        System.out.println(deeltal + "/" + deler + " = " + quotiënt) ;
    }
}
