package be.kdg.abstractbord;

/*
De klasse VierkantBord is een uitbreiding van de klasse Bord.
Er is slechts 1 attribuut, met name de double zijde.
Voorzie een constructor om alle drie de attributen een beginwaarde te geven.
Override de abstracte methode oppervlakte.
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
}