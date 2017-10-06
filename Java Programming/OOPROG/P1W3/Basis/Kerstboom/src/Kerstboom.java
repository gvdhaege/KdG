import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 20:22
 */
public class Kerstboom {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        StringBuilder kerstboom = new StringBuilder();

        System.out.print("Geef de breedte van de kerstboom (oneven getal in bereik 13..29): ");
        int breedte = keyboard.nextInt();

        if (breedte < 13 || breedte > 29 || breedte % 2 == 0) {
            System.out.print("Computer says \"no\"!");
            return;
        } else {
            int midden = (breedte / 2) + 1;
            int spaties = midden - 1;
            int naalden = 1;

            kerstboomAfdrukken(kerstboom, midden, spaties, naalden);
            kerstboomStamAfdrukken(kerstboom, midden);
            System.out.println("\n" + kerstboom);
        }
    }

    private static void kerstboomAfdrukken(StringBuilder kerstboom, int midden, int spaties, int naalden) {
        for (int i = 0; i < midden; i++) {
            for (int j = 0; j < spaties; j++) {
                kerstboom.append(" ");
            }
            spaties--;
            for (int k = 0; k < naalden; k++) {
                kerstboom.append("*");
            }
            naalden += 2;
            kerstboom.append("\n");
        }
    }

    private static void kerstboomStamAfdrukken(StringBuilder kerstboom, int midden) {
        int spaties;
        for (int i = 0; i < 4; i++) {
            spaties = midden - 2;
            for (int j = 0; j < spaties; j++) {
                kerstboom.append(" ");
            }
            for (int k = 0; k < 3; k++) {
                kerstboom.append("*");
            }
            kerstboom.append("\n");
        }
    }
}
