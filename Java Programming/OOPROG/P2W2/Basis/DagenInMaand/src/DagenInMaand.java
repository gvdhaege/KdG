import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DagenInMaand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een jaartal: ");
        if (scanner.hasNextInt()) {
            int jaartal = scanner.nextInt();
            LocalDate localDate = LocalDate.of(jaartal, 1, 1);
            int jaar = localDate.getYear();
            System.out.println("Jaar: " + jaar);
            for (int i = 0; i < 12; i++) {
                String maandNaam = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("nl"));
                int dagen = localDate.getMonth().maxLength();
                if (dagen == 29 && localDate.isLeapYear()) {
                    dagen--;
                }
                System.out.printf("%-11s %d\n", maandNaam, dagen);
                localDate = localDate.plusMonths(1);
            }
        } else {
            System.out.println("Geen geldig jaartal!");
        }
    }
}
