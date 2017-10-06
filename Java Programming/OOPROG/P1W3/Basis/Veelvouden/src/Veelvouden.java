import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 12:43
 */
public class Veelvouden {
    public static void main(String[] args) {
        final int MAX = 100;
        int teller = 1;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Van welk getal wens je de veelvouden? ");
        int getal = keyboard.nextInt();

        while ((getal * teller) < MAX){
            System.out.println(getal * teller);
            teller++;
        }
    }
}
