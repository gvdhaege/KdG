package wijnen;

/**
 * PEER opdracht
 * P2W2
 */
public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private Wijn[] wijnen = new Wijn[MAX_AANTAL];  //voorlopig gevuld met 10 null-objecten
    private String naam; //de naam van het wijnhuis
    private int aantal;  //het werkelijke aantal elementen in de array

    public WijnHuis(String naam) {
        this.naam = naam;
    }

    public boolean zoekWijn(Wijn wijn) {
        //Opgave 5.1
        return false;
    }

    public void voegWijnToe(Wijn nieuw) {
        //Opgave 5.2
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

        StringBuilder wijnenTekst = new StringBuilder();
        StringBuilder likeurenTekst = new StringBuilder();
        StringBuilder champagneTekst = new StringBuilder();
        //Opgave 5.3

        return result.toString();
    }
}
