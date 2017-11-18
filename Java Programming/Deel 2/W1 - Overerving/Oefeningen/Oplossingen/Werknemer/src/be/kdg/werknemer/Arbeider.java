package be.kdg.werknemer;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2009
 */

/*
De klasse Arbeider erft over van de klasse Werknemer.
Voorzie een constante MAX_UREN�PER_WEEK met de waarde 38.
Voorzie een attribuut aantalUren van het type int.
Voorzie een constructor met drie parameters, de naam (string), het nummer (long) en het aantalUren (int).
Voorzie een methode getLoon die het weekloon van de arbeider berekent.
Dit is het uurloon vermenigvuldigd met het aantal gewerkte uren. Alle gepresteerde uren boven MAX_UREN_PER_WEEK worden aan 150% betaald.
Voorzie een toString methode om alle gegevens van de arbeider als een string terug te geven (zie verwachte uitvoer)
 */
public class Arbeider extends Werknemer {
    private static final int MAX_UREN_PER_WEEK = 38;
    private int aantalUren;

    public Arbeider(String naam, long nummer, int aantalUren) {
        super(naam, nummer);
        this.aantalUren = aantalUren;
    }

    public double getLoon() {
        double loon = Werknemer.UURLOON * aantalUren;
        if (aantalUren > MAX_UREN_PER_WEEK) {
            loon += Werknemer.UURLOON / 2 * (aantalUren - MAX_UREN_PER_WEEK);
        }
        return loon;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLoon: €" + getLoon();

    }
}

