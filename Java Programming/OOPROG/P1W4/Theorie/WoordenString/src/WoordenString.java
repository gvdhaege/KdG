import java.util.Scanner;

public class WoordenString {
    public static void main(String[] args) {
        final int MAX_AANTAL = 5;

        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= MAX_AANTAL ; i++) {
            System.out.printf("Geef woord %d: ", i);
            builder.append(scanner.nextLine());
            builder.append(" ");
        }
        System.out.printf("%nInhoud StringBuilder: %s", builder.toString());
        StringBuilder builderKopie = new StringBuilder(builder);
        boolean vergelijk1 = builder == builderKopie;
        boolean vergelijk2 = builder.equals(builderKopie);

        System.out.printf("%nVergelijken met == geeft: %b%n", vergelijk1);
        System.out.printf("Vergelijken met equals geeft: %b%n%n", vergelijk2);


        for (int i = 0; i < builder.length(); i++) {
            builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
        }
        System.out.println("Na omzetting in hoofdletters: " + builder);

    }
}
