package Product;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 18:19
 */
public class Product {

    public static void main(String[] args) {
        int eerste;
        int tweede;
        int derde;
        int product;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef het eerste getal in: ");
        eerste = keyboard.nextInt();
        System.out.print("Geef het tweede getal in: ");
        tweede = keyboard.nextInt();
        System.out.print("Geef het derde getal in: ");
        derde = keyboard.nextInt();
        product = eerste * tweede * derde;
        System.out.println("Het product van deze drie getallen is: " + product);

    }
}
