import java.util.Scanner;

public class TestTemperaturen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperaturen temperaturen = new Temperaturen();

        // Lees de temperaturen in
        System.out.println("Maximale temperaturen voor een ganse week in.");
        for (int i = 0; i < Temperaturen.AANTAL_TEMPERATUREN; i++) {
            System.out.print("Geef de temperatuur voor " +
                    temperaturen.getDag(i) + ": ");
            temperaturen.voegTemperatuurToe(i, scanner.nextDouble());
        }

        // Druk de ingevoerde tempaturen in een tabel af
        System.out.println("\nOverzicht:");
        for (int i = 0; i < Temperaturen.AANTAL_TEMPERATUREN; i++) {
            System.out.printf("%-9s -> %.1f\n",
                    temperaturen.getDag(i), temperaturen.getTemperatuur(i));
        }
        // Druk het gemiddelde af
        System.out.printf("\nDe gemiddelde temperatuur bedraagt: %.1f\n",
                temperaturen.bepaalGemiddeldeTemperatuur());
    }
}