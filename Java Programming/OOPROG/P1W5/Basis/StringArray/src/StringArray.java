import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel woorden ga je intikken? ");
        int aantalWoorden = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        String[] woorden = new String[aantalWoorden];

        for (int i = 0; i < aantalWoorden; i++) {
            System.out.printf("Woord %d: ", i + 1);
            woorden[i] = scanner.nextLine();
        }
        String korste = woorden[0];
        String langste = woorden[0];

        for (String woord : woorden) {
            if (woord.length() > langste.length()) {
                langste = woord;
            }
            if (woord.length() < korste.length()) {
                korste = woord;
            }
        }
        System.out.printf("%nkorste woord: %s", korste);
        System.out.printf("%nlangste woord: %s", langste);


    }
}
