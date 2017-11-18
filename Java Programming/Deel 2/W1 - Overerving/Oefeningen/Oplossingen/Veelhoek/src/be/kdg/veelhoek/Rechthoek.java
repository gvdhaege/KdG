package be.kdg.veelhoek;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21-okt-2009
 */

/*
De klasse Rechthoek is een uitbreiding van de klasse Veelhoek.
Ze bevat de attributen lengte en breedte, beide van het type double.
Voorzie een constructor met drie parameters, de string kleur samen met beide attributen lengte en breedte.
Gebruik "rechthoek" voor soort. Zorg ervoor dat de grootste van beide zijden als lengte wordt genomen.
Voorzie een methode oppervlakte die de oppervlakte van de rechthoek als een double teruggeeft.
Voorzie een toString methode die zowel de attributen van de klasse Veelhoek als de eigen attributen in de vorm van een string teruggeeft.
 */
public class Rechthoek extends Veelhoek {
    private double lengte;
    private double breedte;

    public Rechthoek(String kleur, double lengte, double breedte) {
        super(kleur, "Rechthoek");
        if (lengte > breedte) {
            this.lengte = lengte;
            this.breedte = breedte;
        } else {
            this.lengte = breedte;
            this.breedte = lengte;
        }
    }

    public double oppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n    lengte: " +  lengte +
                "\n    breedte: " + breedte +
                "\n    oppervlakte: " + oppervlakte();
    }

}
