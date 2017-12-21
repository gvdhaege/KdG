package be.kdg.bord;

/*
De klasse RondBord is een uitbreiding van de klasse Bord.
Er is slechts 1 attribuut, met name de double diameter.
Voorzie een constructor om alle drie de attributen een beginwaarde te geven.
Override de methode oppervlakte.
Voorzie een toString methode om materiaal, kleur en oppervlakte als één string terug te geven.
 */
public class RondBord extends Bord {
    private double diameter;

    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;
    }

    @Override
    public double oppervlakte() {
        double straal = diameter / 2;
        return Math.PI * straal * straal;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s %3.0fcm²", "Rond", super.toString(), oppervlakte());
    }
}
