package be.kdg.contact;

/*
De klasse Telefoon bevat twee attributen:
Een string soort (waarden "vast" of "mobiel".
  	Een string nummer (de cijfers van het telefoonnummer.

	Voorzie een constructor die beide attributen van beginwaarden voorziet.
	Voorzie getters voor beide attributen.
	Voorzie een methode isGeldigNummer. Deze methode geeft true terug bij een geldig telefoonnummer en anders false.
    Het aantal cijfers moet overeenstemmen met het soort nummer, 9 bij een vast en 10 bij een mobiel nummer.
    Kijk eerst na of het nummer wel met het cijfer nul begint.
    Maak bij voorkeur gebruik van een locale variabele aantalCijfers (type int).
 */

public class Telefoon {
    private static final int LENGTE_VAST = 9;    // constante
    private static final int LENGTE_MOBIEL = 10; // constante

    private String soort;   // "vast" of "mobiel"
    private String nummer;

    public Telefoon(String eenSoort, String eenNummer) {
        soort = eenSoort;
        nummer = eenNummer;
    }

    public String getSoort() {
        return soort;
    }

    public String getNummer() {
        return nummer;
    }

    public boolean isGeldigNummer() {
        if (nummer.charAt(0) == '0') {
            int aantalCijfers;
            if (soort.equals("vast")) {
                aantalCijfers = LENGTE_VAST;
            } else {
                aantalCijfers = LENGTE_MOBIEL;
            }
            return nummer.length() == aantalCijfers;
        }
        return false;
    }

}

