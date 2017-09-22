package berekeningen;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 18:12
 */
public class Som {

    public static void main(String[] args) {
        int som;
        int eerste;
        int tweede;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Tik een getal in:");
        eerste = keyboard.nextInt();
        System.out.print("Tik nog een getal in:");
        tweede = keyboard.nextInt();
        som = eerste + tweede;
        System.out.println("Dit is de som: " + som);

    }

}
