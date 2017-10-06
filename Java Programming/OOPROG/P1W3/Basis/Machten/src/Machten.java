import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 13:09
 */
public class Machten {
    public static void main(String[] args) {
        final int MAX = 10000;
        int teller = 1;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Van welk getal wens je de machten? ");
        int machtsGetal = keyboard.nextInt();


        while ((Math.pow(machtsGetal, teller)) < MAX) {
            System.out.println((int) Math.pow(machtsGetal, teller));
            teller++;
        }
    }
}
