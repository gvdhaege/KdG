import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 28/09/2017 19:32
 */
public class Belasting {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int counter = 0;

        while (counter < 3) {
            System.out.print("Geef het BTW percentage: ");
            double btwPercentage = keyboard.nextDouble();

            System.out.print("Geef het bedrag in €: ");
            int bedragIngave = keyboard.nextInt();

            System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");
            int inclusiefBTW = keyboard.nextInt();

            if (inclusiefBTW == 1) {
                double btwReken = (btwPercentage + 100) / 100;
                double bedragExclBTW = bedragIngave / btwReken;
                System.out.println("€" + bedragExclBTW + " + " + btwPercentage + "% BTW = € " + bedragIngave + "\n");
            } else if (inclusiefBTW == 2) {
                double bedragBTW = (bedragIngave * btwPercentage) / 100;
                System.out.println("€" + bedragIngave + " + " + btwPercentage + "% BTW = € " + (bedragIngave + bedragBTW)  + "\n");
            } else {
                System.out.print("Foutieve keuze!\n");
            }
            counter++;
        }
    }
}
