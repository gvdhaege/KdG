package be.kdg.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014 19:13
 *
 * Schrijf een programma dat aan de hand van je geboortedatum berekent
 * hoeveel jaren, maanden en dagen je oud bent.
 * 1) Vraag de gebruiker zijn geboortedatum in te geven als 3 afzonderlijke getallen(op verschillende regels)
 * bv. 30, 2 en 1996
 * 2) Vraag de gebruiker zijn geboortedatum als een String in te geven in
 * het formaat dd/mm/jjjj.
 */
public class Leeftijd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef je geboortedag: ");
        int dag = scanner.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int maand = scanner.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int jaar = scanner.nextInt();
        scanner.nextLine();

        toonJarenMaandenDagen(dag, maand, jaar);

        System.out.print("Geef je geboortedatum in de vorm dd/mm/jjjj: ");
        String datum = scanner.nextLine();
        String[] data = datum.split("/");

        dag = Integer.valueOf(data[0]);
        maand = Integer.valueOf(data[1]);
        jaar = Integer.valueOf(data[2]);

        toonJarenMaandenDagen(dag, maand, jaar);

        System.out.print("Geef je geboortedatum in de vorm dd/mm/jjjj: ");
        LocalDate date = LocalDate.parse(scanner.nextLine(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        // System.out.println(date);

        toonJarenMaandenDagen(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    private static void toonJarenMaandenDagen(int dag, int maand, int jaar) {
        LocalDate geboorteDatum = LocalDate.of(jaar, maand, dag);
        LocalDate vandaag = LocalDate.now();
        Period verschil = Period.between(geboorteDatum, vandaag);
        int dagen = verschil.getDays();
        int maanden = verschil.getMonths();
        int jaren = verschil.getYears();
        System.out.printf("Je bent nu %d jaren %d maanden en %d dagen oud.%n", jaren, maanden, dagen);
        System.out.printf("Je bent geboren op een %s%n",
                geboorteDatum.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("NL","be")));
    }
}
