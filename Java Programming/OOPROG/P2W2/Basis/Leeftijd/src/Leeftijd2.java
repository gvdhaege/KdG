import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Leeftijd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef je geboortedatum in de vorm dd/mm/jjjj: ");
        String geboorteDatum = scanner.nextLine();
        String[] geboorteDatumGetallen = geboorteDatum.split("/");
        int geboorteDag = Integer.parseInt(geboorteDatumGetallen[0]);
        int geboorteMaand = Integer.parseInt(geboorteDatumGetallen[1]);
        int geboorteJaar = Integer.parseInt(geboorteDatumGetallen[2]);

        LocalDate geboorte = LocalDate.of(geboorteJaar, geboorteMaand, geboorteDag);
        Period verschil = Period.between(geboorte, LocalDate.now());

        int jaren = verschil.getYears();
        int maanden = verschil.getMonths();
        int dagen = verschil.getDays();
        String dag = geboorte.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("nl"));
        System.out.printf("\nJe bent nu %d jaren %d maanden en %d dagen oud", jaren, maanden, dagen);
        System.out.printf("\nJe bent geboren op een %s", dag);

    }
}
