package be.kdg.veelhoek;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21-okt-2009
 */

/*
 De klasse Driehoek is een uitbreiding van de klasse Veelhoek.
 Ze bevat de attributen basis en hoogte, beide van het type double.
 Voorzie een constructor met drie parameters, de string kleur samen met beide attributen basis en hoogte. Gebruik "driehoek" voor soort.
 Voorzie een methode oppervlakte die de oppervlakte van de driehoek als een double teruggeeft.
 Voorzie een toString methode die zowel de attributen van de klasse Veelhoek als de eigen attributen in de vorm van een string teruggeeft.
 */
public class Driehoek extends Veelhoek {
    private double basis;
    private double hoogte;

    public Driehoek(String kleur, double basis, double hoogte) {
        super(kleur, "Driehoek");
        this.basis = basis;
        this.hoogte = hoogte;
    }

    public double oppervlakte() {
        return basis * hoogte / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n    basis: " +  basis +
                "\n    hoogte: " + hoogte +
                "\n    oppervlakte: " + oppervlakte();
    }
}
