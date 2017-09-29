import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 29/09/2017 18:23
 */
public class Cijfers {

    public static void main(String[] args) {

        boolean stop = false;

        Scanner keyboard = new Scanner(System.in);

        while (!stop) {
            System.out.println("Geef telkens een cijfer in (0..9).");
            System.out.print("Geef het eerste cijfer: ");
            int eersteCijfer = keyboard.nextInt();

            if (eersteCijfer > -1) {
                System.out.print("Geef het tweede cijfer: ");
                int tweedeCijfer = keyboard.nextInt();
                System.out.print("Geef het derde cijfer: ");
                int derdeCijfer = keyboard.nextInt();
                System.out.print("Geef het vierde cijfer: ");
                int vierdeCijfer = keyboard.nextInt();

                String getal = "" + eersteCijfer + tweedeCijfer + derdeCijfer + vierdeCijfer;
                System.out.println("Het getal is " + getal);
            } else {
                stop = true;
            }
        }
    }
}
