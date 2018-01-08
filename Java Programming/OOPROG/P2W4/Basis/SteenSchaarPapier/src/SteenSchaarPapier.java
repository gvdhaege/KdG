import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SteenSchaarPapier {
    public static void main(String[] args) {
        final String[] opties = {"steen", "schaar", "papier"};
        final Scanner scanner = new Scanner(System.in);
        boolean verderGaan = true;

        do {
            System.out.print("Steen, schaar of papier? (of stop) ");
            String keuze = scanner.nextLine().toLowerCase();

            int spelerKeuze = -1;

            switch (keuze) {
                case "stop":
                    verderGaan = false;
                    break;
                case "steen":
                    spelerKeuze = 0;
                    break;
                case "schaar":
                    spelerKeuze = 1;
                    break;
                case "papier":
                    spelerKeuze = 2;
                    break;
                default:
                    throw new InputMismatchException("Invoer is foutief!");
            }
            if (verderGaan) {
                int computerKeuze = new Random().nextInt(3);
                System.out.println("Mijn keuze was: " + opties[computerKeuze]);

                bepaalWinnaar(spelerKeuze, computerKeuze);
                System.out.println();
            }
        } while (verderGaan);
    }

    private static void bepaalWinnaar(int spelerKeuze, int computerKeuze) {
        if (spelerKeuze == computerKeuze) {
            System.out.println("\t Gelijkspel!");
        } else if ((computerKeuze + 1) % 3 == spelerKeuze) {
            System.out.println("\t Ik win!");
        } else {
            System.out.println("\t U wint, proficiat!");
        }
    }
}
