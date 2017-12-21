package be.kdg.bord;

/*
De klasse VierkantBord is een uitbreiding van de klasse Bord.
Er is slechts 1 attribuut, met name de double zijde.
Voorzie een constructor om alle drie de attributen een beginwaarde te geven.
Override de methode oppervlakte.
Voorzie een toString methode om materiaal, kleur en oppervlakte als één string terug te geven.
 */
public class VierkantBord extends Bord {
    private double zijde;

    public VierkantBord(String materiaal, String kleur, double zijde) {
        super(materiaal, kleur);
        this.zijde = zijde;
    }

    @Override
    public double oppervlakte() {
        return zijde * zijde;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s %3.0fcm²", "Vierkant", super.toString(), oppervlakte());
    }
}

