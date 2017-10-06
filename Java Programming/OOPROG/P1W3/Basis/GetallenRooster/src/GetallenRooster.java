import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 14:51
 */
public class GetallenRooster {
    public static void main(String[] args) {
        boolean doorgaan = true;

        Scanner keyboard = new Scanner(System.in);

        while (doorgaan) {
            System.out.print("Geef een getal (1..30) (stop met 0): ");
            int getal = keyboard.nextInt();
            if (getal == 0) {
                doorgaan = false;
            } else if (getal > 30 || getal < 1) {
                System.out.println("Het getal moet in het bereik 1..30 liggen!");
                continue;
            } else {
                for (int i = 0; i <= getal + 1; i++) {
                    System.out.println();
                    if (i == 0 || i == getal + 1) {
                        for (int j = 1; j <= getal; j++) {
                            System.out.print("-----");
                        }
                    } else {
                        for (int j = 0; j <= getal; j++) {
                            if (j == 0) {
                                System.out.print("|");
                            } else {
                                System.out.printf("%3d", j * i);
                                System.out.print("| ");
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
