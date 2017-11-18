package be.kdg.figuren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2013
 *
 */

/*
De klasse Cilinder is een subklasse van de klasse RuimteFiguur en heeft als attributen diameter en lengte (beide van het type double).
De eerste constructor met drie parameters vult de attribuutwaarden kleur (klasse RuimteFiguur) en diameter en lengte in.
De tweede constructor met twee parameters vult voor de attribuutwaarde klaur "zwart" in en en vult de diameter en de lengte in.
De default constructor vult zowel voor de diameter als voor de lengte de waarde 1.0 in.
Voorzie een getter voor de diameter.
De methode oppervlakte geeft de oppervlakte van de cilinder terug (2 * PI * r * (lengte + r).
De methode inhoud geeft het volume van de cilinder terug (PI * lengte * r).

 */
public class Cilinder extends RuimteFiguur {
    private double diameter;
    private double lengte;

    public Cilinder(String kleur, double diameter, double lengte) {
        super(kleur);
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public Cilinder(double diameter, double lengte) {
        super("zwart");
        this.diameter = diameter;
        this.lengte = lengte;
        // this("zwart", diameter, lengte);
    }

    public Cilinder() {
        diameter = 1.0;
        lengte = 1.0;
        // this("zwart", 1.0, 1.0);
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public double oppervlakte() {
        double straal = diameter / 2;
        return 2 * Math.PI * straal * (lengte + straal);
    }

    @Override
    public double inhoud() {
        return Math.PI * lengte * Math.pow(diameter / 2, 2);
    }
}

