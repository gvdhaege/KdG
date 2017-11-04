import java.util.Scanner;

public class Temperaturen {
    public static void main(String[] args) {
        final int AANTAL_TEMPERATUREN = 3;
        double[] temperaturen = new double[AANTAL_TEMPERATUREN];
        double som = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Geef de %d temperaturen: %n", AANTAL_TEMPERATUREN);

        for (int i = 1; i <= AANTAL_TEMPERATUREN; i++) {
            System.out.printf("Dag %d: ", i);
            temperaturen[i - 1] = scanner.nextDouble();
        }

        System.out.print("Overzicht:\n");
        System.out.println("=================");

        for (int i = 1; i <= AANTAL_TEMPERATUREN; i++) {
            System.out.printf("Dag %d:\t\t %.1f%n", i, temperaturen[i - 1]);
        }

        for (double temperatuur : temperaturen) {
            som += temperatuur;
        }
        double gemiddelde = som / AANTAL_TEMPERATUREN;
        System.out.println("=================");
        System.out.format("Gemiddelde: %.2f", gemiddelde);
    }
}
