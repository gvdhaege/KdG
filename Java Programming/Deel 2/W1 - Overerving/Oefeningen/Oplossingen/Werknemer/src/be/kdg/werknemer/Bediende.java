package be.kdg.werknemer;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2009
 */

/*
De klasse Bediende erft over van de klasse Werknemer.
Voorzie een constante LOONFACTOR met de waarde 192.
Voorzie een attribuut weddeBarema van het type double.
Voorzie een constructor met drie parameters, de naam (string), het nummer (long) en het weddeBarema (double).
Voorzie een methode getLoon die het product van het uurloon, de LOONFACTOR en het weddeBarema teruggeeft
Voorzie een toString methode om alle gegevens van de bediende als een string terug te geven (zie verwachte uitvoer)
 */
public class Bediende extends Werknemer {
    private static final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, long nummer, double weddeBarema) {
        super(naam, nummer);
        this.weddeBarema = weddeBarema;
    }

    public double getLoon() {
        return Werknemer.UURLOON * LOONFACTOR * weddeBarema;
    }

    @Override 
    public String toString() {
        return super.toString() + "\nLoon: €" + getLoon();
    }
}

