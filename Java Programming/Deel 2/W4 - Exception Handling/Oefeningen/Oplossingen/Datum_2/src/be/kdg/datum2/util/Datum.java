package be.kdg.datum2.util;

import be.kdg.datum2.io.DateIOException;

/**
 * Klasse om een datum bij te houden in de vorm van 3 int waarden.
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
     */
    public Datum(int dag, int maand, int jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    /**
     * Copy constructor.
     *
     * @param datum De datum
     */
    public Datum(Datum datum) {
        this(datum.dag, datum.maand, datum.jaar);
    }

    /**
     * Constructor op basis van een string: "dd/mm/yyyy"
     * Controleer of het formaat van de string correct is.
     * Haal dag, maand en jaartal uit de string. Controleer of deze gegevens numeriek zijn.
     * @param datumString
     * @throws DateIOException indien het een ongeldige datum is.
     */
    public Datum(String datumString) throws DateIOException {
        String[] tokens = datumString.split("/");
        try {
            dag = Integer.parseInt(tokens[0]);
            maand = Integer.parseInt(tokens[1]);
            jaar = Integer.parseInt(tokens[2]);

            if (!Datum.isGeldigeDatum(dag, maand, jaar)) {
                throw new DateIOException("Ongeldige datum", datumString);
            }
        } catch (NumberFormatException e) {
            throw new DateIOException("Foutief datumformaat (dd/mm/yyyy)", datumString);
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
     * Geeft de naam van de maand.
     *
     * @return de maandnaam
     */
    public String getMaandNaam() {
        return maandNamen[maand - 1];
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
     * Geeft de datum als een string.
     * De maand wordt als maandnaam gegeven (dd <i>maandnaam</i> yyyy).
     *
     * @return een datumstring
     */
    public String getDatum() {
        return dag + " " + maandNamen[maand - 1] + " " + jaar;
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
     * Geeft de datum als een string.
     *
     * @return een datumstring
     * @see #getDatum
     */
    public String toString() {
        return getDatum();
    }

    /**
     * Test of twee Datum objecten gelijk zijn. Om gelijk te zijn moeten
     * zowel dag, maand als jaar overeenstemmen.
     *
     * @param object Een andere datum
     * @return true als gelijk, anders false
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Datum)) return false;
        Datum datum = (Datum) object;
        return dag == datum.dag && maand == datum.maand && jaar == datum.jaar;
    }

    /**
     * Geeft een hashcode op basis van dag, maand en jaar.
     *
     * @return een hashcode
     */
    public int hashCode() {
        int result = 29 * dag + maand;
        return 29 * result + jaar;
    }

    /**
     * Vergelijkt twee Datum objecten. Geeft een positieve waarde als
     * de argument-datum recenter is dan deze datum, een negatieve waarde als
     * het andersom is en nul bij gelijkheid.
     *
     * @param andereDatum een andere datum
     * @return het verschil
     */
    public int compareTo(Datum andereDatum) {
        int jaarVerschil = andereDatum.jaar - jaar;
        if (jaarVerschil != 0) return jaarVerschil;
        int maandVerschil = andereDatum.maand - maand;
        if (maandVerschil != 0) return maandVerschil;

        return andereDatum.dag - dag;

    }

    /**
     * Test of deze datum vroeger is dan de argument-datum.
     *
     * @param datum een andere datum
     * @return true indien vroeger, anders false
     */
    public boolean isVroeger(Datum datum) {
        if (jaar < datum.jaar)
            return true;
        else if (jaar > datum.jaar)
            return false;
        else if (maand < datum.maand)
            return true;
        else if (maand > datum.maand)
            return false;
        else return dag < datum.dag;
    }

    /**
     * Test of deze datum later is dan de argument-datum.
     *
     * @param datum een andere datum
     * @return true indien later, anders false
     */
    public boolean isLater(Datum datum) {
        if (jaar < datum.jaar)
            return false;
        else if (jaar > datum.jaar)
            return true;
        else if (maand < datum.maand)
            return false;
        else if (maand > datum.maand)
            return true;
        else return dag >= datum.dag;
    }

    /**
     * Test of twee datums gelijk zijn.
     * Ze zijn gelijk als zowel dag, maand als jaar overeenstemmen.
     *
     * @param datum een andere Datum
     * @return true als gelijk, anders false
     */
    public boolean isGelijk(Datum datum) {
        return jaar == datum.jaar && maand == datum.maand && dag == datum.dag;
    }

    /**
     * Zet de datum op de volgende kalenderdag.
     */
    public void volgendeDag() {
        ++dag;
        switch (maand) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (dag > 31) {
                    dag = 1;
                    ++maand;
                }
                break;
            case 12:
                if (dag > 31) {
                    dag = 1;
                    maand = 1;
                    ++jaar;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dag > 30) {
                    dag = 1;
                    ++maand;
                }
                break;
            case 2:
                if (dag > 29 ||
                        dag == 29 && (jaar % 4 > 0 || jaar % 100 == 0) && jaar % 400 > 0) {
                    dag = 1;
                    ++maand;
                }
                break;  // eigenlijk overbodig!
        }
    }
}
