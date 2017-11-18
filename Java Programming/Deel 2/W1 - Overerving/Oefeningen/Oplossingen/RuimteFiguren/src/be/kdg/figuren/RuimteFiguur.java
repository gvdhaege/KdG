package be.kdg.figuren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2013
 */

/**
 * Deze klasse is de superklasse voor allerlei soorten ruimtefiguren.
 *
 * HIER MAG JE NIETS AAN WIJZIGEN!
 */
public class RuimteFiguur {
    private String kleur;

    /**
     * Constructor die de kleur invult.
     * @param kleur De kleur
     */
    public RuimteFiguur(String kleur) {
        this.kleur = kleur;
    }

    /**
     * Default constructor die als kleur zwart invult.
     */
    public RuimteFiguur() {
        kleur = "zwart";
    }

    /**
     * Getter voor de kleur;
     * @return de kleur
     */
    public String getKleur() {
        return kleur;
    }

    /**
     * Methode die de oppervlakte van een ruimtefiguur teruggeeft
     * (om in de subklassen te 'overriden')
     * @return  0.0
     */
    public double oppervlakte() {
        return 0.0;
    }

    /**
     * Methode die de inhoud van een ruimtefiguur teruggeeft
     * (om in de subklassen te 'overriden')
     * @return 0.0
     */
    public double inhoud() {
        return 0.0;
    }

    /**
     * Methode om de gegevens van de ruimtefiguur te tonen (zie TestFiguren).
     */
    public void toonFiguur() {
        System.out.format("kleur: %-5s   oppervlakte: %5.3f   inhoud: %5.3f\n", kleur, oppervlakte(), inhoud());
    }

}

/*
kleur: zwart   oppervlakte: 12,566   inhoud: 4,189
kleur: zwart   oppervlakte: 24,000   inhoud: 8,000
kleur: groen   oppervlakte: 37,699   inhoud: 15,708
kleur: geel    oppervlakte: 54,000   inhoud: 27,000
kleur: rood    oppervlakte: 50,265   inhoud: 33,510
*/