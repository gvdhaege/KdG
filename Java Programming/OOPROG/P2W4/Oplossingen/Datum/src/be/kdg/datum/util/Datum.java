package be.kdg.datum.util;

import be.kdg.datum.io.DateIOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Klasse om een datum bij te houden in de vorm van 3 int waarden.
 * Werk de ontbrekende methoden uit.
 */
public class Datum implements Comparable<Datum> {
    /**
     * Tabel met de maandnamen.
     */
    private static final String[] maandNamen = {
            "januari", "februari", "maart", "april", "mei", "juni", "juli",
            "augustus", "september", "oktober", "november", "december"
    };
    private int dag;
    private int maand;
    private int jaar;

    /**
     * Constructor voor een Datum-object op basis van dag, maand en jaar.
     *
     * @param dag   De dag
     * @param maand De maand
     * @param jaar  Het jaar
     * @throws DateIOException indien het een ongeldige datum is.
     */
    public Datum(int dag, int maand, int jaar) {
        if (!isGeldigeDatum(dag, maand, jaar)) {
            throw new DateIOException("Datum ligt voor het jaar 1600");
        }
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    /**
     * Copy constructor.
     *
     * @param datum
     * @throws DateIOException indien het een ongeldige datum is.
     */
    public Datum(Datum datum) throws DateIOException {
        this(datum.getDag(), datum.getMaand(), datum.getJaar());
    }

    /**
     * Constructor op basis van een string: "dd/mm/yyyy"
     * Controleer of het formaat van de string correct is.
     * Haal dag, maand en jaartal uit de string. Controleer of deze gegevens numeriek zijn.
     *
     * @param datumStr
     * @throws DateIOException indien het een ongeldige datum is.
     */
    public Datum(String datumStr) throws DateIOException {
        // deze regular expression is iets te goed voor deze opgave...
        //if (!datumStr.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$"))
        // throw new DateIOException("Formaat van uw datum is verkeerd");

        String[] delen = datumStr.split("/");
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date datum = formatter.parse(datumStr);

            int dag = Integer.parseInt(delen[0]);
            int maand = Integer.parseInt(delen[1]);
            int jaar = Integer.parseInt(delen[2]);
            if (!isGeldigeDatum(dag, maand, jaar)) {
                throw new DateIOException("Ongeldige datum");
            }
            this.dag = dag;
            this.maand = maand;
            this.jaar = jaar;
        } catch (NumberFormatException e) {
            throw new DateIOException("Een deel van de datum was incorrect", e);
        } catch (ParseException e) {
            throw new DateIOException("Het formaat van de datum is verkeerd", e);
        }
    }

    /**
     * Test of een datum mogelijk is. Datums voor het jaar 1600 worden als fout beschouwd.
     *
     * @param dag   De dag
     * @param maand De maand
     * @param jaar  Het jaar
     * @return true bij een geldige datum, anders false
     */
    public static boolean isGeldigeDatum(int dag, int maand, int jaar) {
        if (jaar < 1600)
            return false;
        else if (maand < 1 || maand > 12)
            return false;
        else if (dag < 1 || dag > 31)
            return false;
        else if (dag == 31 && (maand == 2 || maand == 4 || maand == 6 || maand == 9 || maand == 11))
            return false;
        else if (dag == 30 && maand == 2)
            return false;
        else return !(dag == 29 && maand == 2 && (jaar % 4 > 0 || jaar % 100 == 0) && jaar % 400 > 0);
    }

    /**
     * Geeft de dag.
     *
     * @return de dag
     */
    public int getDag() {
        return dag;
    }

    /**
     * Geeft de maand.
     *
     * @return de maand
     */
    public int getMaand() {
        return maand;
    }

    /**
     * Geeft het jaar.
     *
     * @return het jaar
     */
    public int getJaar() {
        return jaar;
    }

    /**
     * Zet nieuwe waarden voor dag, maand en jaar.
     *
     * @param dag   De dag
     * @param maand De maand
     * @param jaar  Het jaar
     */
    public void setDatum(int dag, int maand, int jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    /**
     * Geeft de naam van de maand.
     * Gebruik de array maandnamen die hierboven werd gedeclareerd
     *
     * @return de maandnaam
     */
    public String getMaandNaam() {
        return maandNamen[maand - 1];
    }

    /**
     * Geeft de datum als een string.
     * De maand wordt als maandnaam gegeven (dd maandnaam> yyyy).
     *
     * @return een datumstring
     */
    public String getLangeDatum() {
        return dag + " " + getMaandNaam() + " " + jaar;
    }

    /**
     * Geeft de datum als een string.
     * Formaat:dd/mm/yyyy.
     *
     * @return een datumstring
     */
    public String getKorteDatum() {
        return dag + "/" + maand + "/" + jaar;
    }

    /**
     * Geeft de datum als een string.
     *
     * @return een datumstring
     * @see #getLangeDatum
     */
    public String toString() {
        return getLangeDatum();
    }

    /**
     * Vergelijkt twee Datum objecten. Geeft een positieve waarde als
     * de argument-datum recenter is dan deze datum, een negatieve waarde als
     * het andersom is en nul bij gelijkheid.
     *
     * @param other een andere datum
     * @return het verschil
     */
    public int compareTo(Datum other) {
        return 0;
    }

    /**
     * Test of deze datum vroeger is dan de argument-datum.
     *
     * @param datum een andere datum
     * @return true indien vroeger, anders false
     */
    public boolean isVroeger(Datum datum) {
        return false;
    }

    /**
     * Test of deze datum later is dan de argument-datum.
     *
     * @param datum een andere datum
     * @return true indien later, anders false
     */
    public boolean isLater(Datum datum) {
        return false;
    }
}