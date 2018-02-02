package be.kdg.leden;

/*
Deze klasse bevat naast de attributen naam (String), soort (Soort) en lidnummer (int) met beginwaarde 1000 een klassevariable aantal leden (static in) met beginwaarde 0.
Voorzie een getter voor aantalLeden.
Voorzie een constructor met twee parameters waarmee je naam en soort van een waarde geeft.
In de constructor moet je indien de soort Soort.STEUNEND is het lidnummer op 0 zetten.
In de andere gevallen verhoog je aantalLeden en ken je als lidnummer de startwaarde verhoogd met het aantal leden toe.
Voorzie een getter voor het lidnummer.
Voorzie een toString-methode om lidnummer, naam en soort als een string terug te geven (zie TestLeden voor de juiste vorm).
 */
public class Lid {
    private static int aantalLeden = 0;

    private String naam;
    private Soort soort;
    private int lidNummer = 1000;

    public static int getAantalLeden() {
        return aantalLeden;
    }

    public Lid(String naam, Soort soort) {
        this.naam = naam;
        this.soort = soort;
        if (soort != Soort.STEUNEND) {
            lidNummer += ++aantalLeden;
        } else {
            lidNummer = 0;
        }
    }

    public int getLidNummer() {
        return lidNummer;
    }

    public String toString() {
        return String.format("%5d %-9s   soort: %s", lidNummer, naam, soort);
    }
}
