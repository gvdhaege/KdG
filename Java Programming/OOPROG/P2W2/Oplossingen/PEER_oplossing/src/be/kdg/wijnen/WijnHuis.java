package be.kdg.wijnen;

/**
 * Mark Goovaerts
 * Datum: 4-11-13
 * Johan Ven
 * Datum: 10-11-14
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
        for (Wijn mijnWijn : wijnen) {
            if(mijnWijn.getNaam().equals(wijn.getNaam())){
                return true;
            }
        }
        return false;
    }

    public void voegWijnToe(Wijn nieuw) {
        //Opgave 5.2
        if(aantal < wijnen.length) {
            wijnen[aantal] = nieuw;
            aantal++;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

        StringBuilder wijnenTekst = new StringBuilder();
        StringBuilder likeurenTekst = new StringBuilder();
        StringBuilder champagneTekst = new StringBuilder();

        //Opgave 5.3
        for (Wijn wijn : wijnen) {
            if(wijn instanceof Champagne){
                champagneTekst.append("\t" + wijn.toString().replace("\n", " ") + "\n");
            }else if(wijn instanceof Likeur) {
                likeurenTekst.append("\t" + wijn.toString().replace("\n", " ") + "\n");
            } else
                wijnenTekst.append("\t" + wijn.toString().replace("\n", " ") + "\n");
        }
        result.append("Wijnen:\n");
        result.append(wijnenTekst.toString());
        result.append("\nChampagnes:\n");
        result.append(champagneTekst.toString());
        result.append("\nLikeuren:\n");
        result.append(likeurenTekst.toString());

        return result.toString();
    }
}
