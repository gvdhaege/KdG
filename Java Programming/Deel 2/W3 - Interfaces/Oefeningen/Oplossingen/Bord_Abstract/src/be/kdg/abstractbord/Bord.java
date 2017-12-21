package be.kdg.abstractbord;

/*
De klasse Bord is een abstracte klasse. Dit wil zeggen dat je er rechtstreeks geen objecten kunt van maken.
De attributen zijn materiaal en kleur, beide van het type String.
Voorzie een constructor die beide attributen een beginwaarde geeft.
Voorzie een abstracte methode oppervlakte die een double teruggeeft.
Voorzie een toString methode om materiaal en kleur als één string terug te geven.
*/
public abstract class Bord {
    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur) {
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    public abstract double oppervlakte();

    public String toString() {
        return String.format("%-9s %-6s", materiaal, kleur);
    }
}
