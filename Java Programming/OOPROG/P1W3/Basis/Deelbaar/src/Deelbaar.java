import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 13:14
 */
public class Deelbaar {
    public static void main(String[] args) {
        final int MAX = 1000;
        int teller = 0;
        boolean doorgaan = true;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Dit programma geeft alle getallen tussen 1 en 1000 die deelbaar zijn door beide opgegeven positieve delers.");
        while (doorgaan) {
            System.out.print("Geef de eerste deler (stop met 0): ");
            int eersteDeler = keyboard.nextInt();
            if (eersteDeler == 0) {
                doorgaan = false;
            } else if (eersteDeler > 0) {
                System.out.print("Geef de tweede deler: ");
                int tweedeDeler = keyboard.nextInt();
                if (tweedeDeler > 0) {
                    for (int i = 1; i < MAX; i++) {
                        if (i % eersteDeler == 0 && i % tweedeDeler == 0) {
                            System.out.print(i + "\t");
                            teller++;
                            if (teller % 10 == 0) {
                                System.out.println("");
                            }
                        }
                    }
                    System.out.println("\n");
                } else {
                    System.out.println("foutieve ingave");
                }
            }
        }
    }
}


