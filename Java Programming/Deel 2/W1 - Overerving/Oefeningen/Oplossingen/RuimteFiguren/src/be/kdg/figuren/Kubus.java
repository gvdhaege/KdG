package be.kdg.figuren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2009
 */

/*
De klasse Kubus is een subklasse van de klasse RuimteFiguur en heeft als attribuut ribbe (type double).
De eerste constructor met twee parameters vult de attribuutwaarden kleur (klasse RuimteFiguur) en ribbe in.
De tweede constructor met één parameter vult voor de attribuutwaarde klaur "zwart" in en en vult de ribbe in.
De default constructor vult als ribbe de waarde 1.0 in.
Voorzie een getter voor de ribbe.
De methode oppervlakte geeft de oppervlakte van de kubus terug (6 * ribbe³).
De methode inhoud geeft het volume van de kubus terug (ribbe³).
*/
public class Kubus extends RuimteFiguur {
    private double ribbe;

    public Kubus(String kleur, double straal) {
        super(kleur);
        this.ribbe = straal;
    }

    public Kubus(double ribbe) {
        super("zwart");
        this.ribbe = ribbe;
        // this("zwart", ribbe);
    }

    public Kubus() {
        ribbe = 1.0;
        // this("zwart", 1.0);
    }

    public double getRibbe() {
        return ribbe;
    }

    @Override
    public double oppervlakte() {
        return 6  * ribbe * ribbe;
    }

    @Override
    public double inhoud() {
        return Math.pow(ribbe, 3);
    }
}

