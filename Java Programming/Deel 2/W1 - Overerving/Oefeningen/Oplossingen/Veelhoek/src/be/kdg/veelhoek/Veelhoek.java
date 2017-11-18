package be.kdg.veelhoek;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21-okt-2009
 */

/*
De klasse Veelhoek bevat twee attributen van het type String, met name kleur en soort (bv. "zwart" en "driehoek").
Voorzie een constructor die beide attributen van een waarde voorziet.
Voorzie een toString-methode die de attributen als een string teruggeeft (bv. "DRIEHOEK (zwart)"). Tip! Pas de String methode toUpperCase() op het attribuut soort toe. . 
 */
public class Veelhoek {
    private String kleur; //bijvoorbeeld: "zwart"
    private String soort; //bijvoorbeeld: "driehoek"

    public Veelhoek(String kleur, String soort) {
        this.kleur = kleur;
        this.soort = soort;
    }

    @Override
    public String toString() {
        //bijvoorbeeld: "DRIEHOEK (zwart)"
        return soort.toUpperCase() + " (" + kleur + ")";
    }
}

