import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int geboortedag = scanner.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int geboortemaand = scanner.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int geboortejaar = scanner.nextInt();

        LocalDate geboorteDatum = LocalDate.of(geboortejaar, geboortemaand, geboortedag);
        Period aantalJaren = Period.between(geboorteDatum, LocalDate.now());
        int jaren = aantalJaren.getYears();
        int maanden = aantalJaren.getMonths();
        int dagen = aantalJaren.getDays();
        String dag = geboorteDatum.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("nl"));
        System.out.printf("\nJe bent nu %d jaren %d maanden en %d dagen oud", jaren, maanden, dagen);
        System.out.printf("\nJe bent geboren op een %s", dag);
    }
}
