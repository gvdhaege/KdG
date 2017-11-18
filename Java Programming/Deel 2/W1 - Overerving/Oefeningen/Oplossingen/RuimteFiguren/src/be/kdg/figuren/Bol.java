package be.kdg.figuren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2013
 */

/*
De klasse Bol is een subklasse van de klasse RuimteFiguur en heeft als attribuut straal (type double).
De eerste constructor met twee parameters vult de attribuutwaarden kleur (klasse RuimteFiguur) en straal in.
De tweede constructor met één parameter vult voor de attribuutwaarde klaur "zwart" in en en vult de straal in.
De default constructor vult als straal de waarde 1 in.
Voorzie een getter voor de straal.
De methode oppervlakte geeft de oppervlakte van de bol terug (4 * PI * r²).
De methode inhoud geeft het volume van de bol terug (4/3 * PI * r²).
 */
public class Bol extends RuimteFiguur {
    private double straal;

    public Bol(String kleur, double straal) {
        super(kleur);
        this.straal = straal;
    }

    public Bol(double straal) {
        super("zwart");
        this.straal = straal;
        // this("zwart", straal);
    }

    public Bol() {
        straal = 1.0;
        // this("zwart", 1.0);
    }

     public double getStraal() {
        return straal;
    }

    @Override
    public double oppervlakte() {
        return 4 * Math.PI * straal * straal;
    }

    @Override
    public double inhoud() {
        return 4 * Math.PI * Math.pow(straal, 3) / 3;
    }

}
