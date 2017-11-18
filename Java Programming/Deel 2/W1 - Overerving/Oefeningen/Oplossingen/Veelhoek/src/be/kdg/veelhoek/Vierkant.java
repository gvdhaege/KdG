package be.kdg.veelhoek;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21-okt-2009
 */

/*
De klasse Vierkant is een uitbreiding van de klasse Veelhoek.
Ze bevat slechts ��n attribuut, met name de double zijde.
Voorzie een constructor met twee parameters, de string kleur samen met het attribuut zijde. Gebruik "Vierkant" voor de soort.
Voorzie een methode oppervlakte die de oppervlakte van het vierkant als een double teruggeeft.
Voorzie een toString methode die zowel de attributen van de klasse Veelhoek als de eigen attributen in de vorm van een string teruggeeft.
 */
public class Vierkant extends Veelhoek {
    private double zijde;

    public Vierkant(String kleur, double zijde) {
        super(kleur, "Vierkant");
        this.zijde = zijde;
    }

    public double oppervlakte() {
        return zijde * zijde;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n    zijde: " +  zijde +
                "\n    oppervlakte: " + oppervlakte();
    }
}
