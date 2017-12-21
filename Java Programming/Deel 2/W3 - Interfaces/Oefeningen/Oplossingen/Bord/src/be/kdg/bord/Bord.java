package be.kdg.bord;

/*
De klasse Bord heeft als attributen materiaal en kleur, beide van het type String.
Voorzie een constructor die beide attributen een beginwaarde geeft.
Voorzie een methode oppervlakte die een double met als waarde 0.0 teruggeeft (anders geen polymorfisme mogelijk).
Voorzie een toString methode om materiaal en kleur als één string terug te geven.
*/
public class Bord {
    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur) {
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    public double oppervlakte() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%-9s %-6s", materiaal, kleur);
    }
}
