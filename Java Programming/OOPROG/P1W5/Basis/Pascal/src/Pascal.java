import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        final int AANTAL_RIJEN = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef het aantal rijen: ");
        int aantal = scanner.nextInt();

        if (aantal < 0 || aantal > 12) {
            aantal = AANTAL_RIJEN;
        }

        int[][] driehoek = new int[aantal][aantal];

        for (int i = 0; i < aantal; i++) {
            driehoek[i] = new int[i + 2];
            driehoek[i][0] = 1;
        }

        for (int i = 1; i < aantal; i++) {
            for (int j = 1; j < (i + 1); j++) {
                driehoek[i][j] = driehoek[i - 1][j - 1] + driehoek[i - 1][j];
            }
        }

        for (int i = 0; i < aantal; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.printf("%4d", driehoek[i][j]);
            }
            System.out.println();
        }
    }
}
