import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 29/09/2017 17:12
 */
public class Getallen2 {

    public static void main(String[] args) {

        final long MINIMUM_DEELTAL = 1000000000000L;
        final long MINIMUM_DELER = 10000000L;

        int counter = 0;

        Scanner keyboard = new Scanner(System.in);

        while (counter < 3) {
            System.out.print("Geef een geheel getal van 13 cijfers: ");
            float deeltal = keyboard.nextFloat();
            if (deeltal < MINIMUM_DEELTAL) {
                System.out.println("Dit getal is te klein!");
                break;
            }
            System.out.print("Geef een geheel getal van 8 cijfers: ");
            float deler = keyboard.nextFloat();
            if (deler < MINIMUM_DELER) {
                System.out.println("Dit getal is te klein!");
                break;
            }

            float quotient = deeltal / deler;
            System.out.println("Het quotiënt is: " + quotient);

            long quotientGeheel = (long) quotient;
            System.out.println("Zonder decimalen is dit: " + quotientGeheel);
            counter++;
        }

    }
}
