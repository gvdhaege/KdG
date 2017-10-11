/**
 * Klasse om een datum bij te houden in de vorm van 3 int waarden.
 */
public class Datum {
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
     * Constructor op basis van een string: "dd/mm/yyyy"
     * Controleer of het formaat van de string correct is.
     * Haal dag, maand en jaartal uit de string.
     *
     * @param datumString Datum in de vorm van een string dd/mm/yyyy
     */
    public Datum(String datumString) {
        String[] tokens = datumString.split("/");
        dag = Integer.parseInt(tokens[0]);
        maand = Integer.parseInt(tokens[1]);
        jaar = Integer.parseInt(tokens[2]);
    }

    /**
     * Test of een datum mogelijk is. Datums voor het jaar 1600 worden als fout beschouwd.
     *
     * @param dag   De dag
     * @param maand De maand
     * @param jaar  Het jaar
     * @return true bij een geldige datum, anders false
     */
    public boolean isGeldigeDatum(int dag, int maand, int jaar) {
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
     * Test of twee datums gelijk zijn.
     * Ze zijn gelijk als zowel dag, maand als jaar overeenstemmen.
     * * @param datum een andere Datum
     *
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
                break;
        }
    }
}