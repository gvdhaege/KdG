package be.kdg.datum2;

import be.kdg.datum2.io.DateIOException;
import be.kdg.datum2.util.Datum;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Demo voor de DateIOException klasse.
 * <p/>
 * Vul deze klasse aan zodat je bij uitvoering de gewenste afdruk (zie onderaan)
 * kan bekomen. Je zal ook een afzonderlijke klasse DateIOException moeten maken.
 */
public class DatumTest {
    public static void main(String[] args) {
        try {
            String invoer = leesDatum();
            try {
                valideerInvoer(invoer);
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date datum = formatter.parse(invoer);
                System.out.println(datum);
            } catch (DateIOException | ParseException e) {  // <-- van valideerInvoer  en van parse
                System.out.println(e);
            }
        } catch (IOException e) { // <-- van leesDatum
            System.out.println(e);
        }
    }

    /**
     * Leest een datum in van de standaard invoer.
     *
     * @return De ingelezen datum
     * @throws java.io.IOException Geeft exception als er iets misgaat bij het inlezen.
     */
    private static String leesDatum() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een datum in de vorm dd/mm/yyyy: ");
        return scanner.nextLine();
    }

    /**
     * Valideert een datum (in de vorm van een String).
     * We maken gebruik van de methode isGeldigeDatum van de klasse Datum
     * uit de Stream-opgave Datum.
     *
     * @param datum Een datum in het formaat dd/mm/yyyy
     * @throws DateIOException Geeft exception bij ongeldige datum of foutief formaat
     */
    private static void valideerInvoer(String datum) throws DateIOException {
        String[] tokens = datum.split("/");

        // vanaf hier aanvullen
        try {
            int dag = Integer.parseInt(tokens[0]);
            int maand = Integer.parseInt(tokens[1]);
            int jaar = Integer.parseInt(tokens[2]);

            if (!Datum.isGeldigeDatum(dag, maand, jaar)) {
                throw new DateIOException("Ongeldige datum", datum);
            }
        } catch (NumberFormatException e) {
            throw new DateIOException("Foutief datumformaat (dd/mm/yyyy)", datum);
        }
    }
}

/*
Geef een datum in de vorm dd/mm/yyyy: 30 april 2014
be.kdg.io.DateIOException: Foutief datumformaat (dd/mm/yyyy) - 30 april 2014
*/

/*
Geef een datum in de vorm dd/mm/yyyy: 29/02/2013
be.kdg.io.DateIOException: Ongeldige datum - 29/02/2013
*/

/*
Geef een datum in de vorm dd/mm/yyyy: 15/11/2013
Fri Nov 15 00:00:00 CET 2013
*/
