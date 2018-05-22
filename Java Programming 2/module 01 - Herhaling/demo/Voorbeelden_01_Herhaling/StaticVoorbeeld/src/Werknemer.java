
public class Werknemer {
    //instance variabele:
    private String naam;

    //klasse variabele:
    private static int aantal = 0;

    public Werknemer(String naam) {
        this.naam = naam;
        aantal++;
    }

    //Een gewone getter die een instantie attribuut benadert:
    public String getNaam() {
        return naam;
    }

    //Een getter die een static attribuut benadert is zelf ook static:
    public static int getAantal() {
        return aantal;
    }
}
