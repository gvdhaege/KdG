import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 28/09/2017 19:59
 */
public class Getallen {

    public static void main(String[] args) {

        final int MINIMUM = 100000;
        final int MAXIMUM = 999999;

        long product;
        long laatste5cijfers;

        Scanner keyboard = new Scanner(System.in);


        for (int i = 0; i < 2; i++) {
            System.out.print("Geef een geheel getal van 6 cijfers: ");
            long geheelGetalEen = keyboard.nextLong();
            System.out.print("Geef nog een geheel getal van 6 cijfers: ");
            long geheelGetalTwee = keyboard.nextLong();

            if (geheelGetalEen < MINIMUM || geheelGetalTwee < MINIMUM) {
                System.out.println("Een van de twee getallen is te klein.");
            } else if (geheelGetalEen > MAXIMUM || geheelGetalTwee > MAXIMUM) {
                System.out.println("Een van de twee getallen is te groot.");
            } else {
                product = (geheelGetalEen * geheelGetalTwee);
                laatste5cijfers = product % 100000;
                System.out.println("Het product is: " + product);
                System.out.println("De laatste 5 cijfers zijn: " + laatste5cijfers + "\r\n");
            }
        }
    }
}
