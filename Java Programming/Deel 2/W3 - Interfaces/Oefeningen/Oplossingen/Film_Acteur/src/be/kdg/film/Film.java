package be.kdg.film;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class Film {
    // Inner class
    // Kan niet niet private zijn omwille van externe creatie Acteur object
    // (wel package, protected of public) --> best package en indien dit niet kan public
     class Acteur {
        private String naam;
        // overige gegevens

        public Acteur(String naam) {
            this.naam = naam;
        }

        // Geforceerd voorbeeld (toegang tot private attribuut omhullende klasse)
        public void setTitel(String titel) {
            Film.this.titel = titel;
        }
    }
    // Einde inner class

    private String titel;
    private int jaar;
    private Acteur acteur;
    private Acteur actrice;

    public Film() {
        this("", 0, "", "");
    }

    public Film(String titel) {
        this(titel, 0, "", "");
    }

    public Film(String titel, int jaar) {
        this(titel, jaar, "", "");
    }

    public Film(String titel, int jaar, String acteur, String actrice) {
        this.titel = titel;
        this.jaar = jaar;
        this.acteur = new Acteur(acteur);
        this.actrice = new Acteur(actrice);
    }

    /*
    public Film(Film film) {
        this(film.titel, film.jaar, film.getActeurNaam(), film.getActriceNaam());
    }
    */

    public String getTitel() {
        return this.titel;
    }

    public String getJaar() {
        return (jaar != 0) ? Integer.toString(jaar) : "onbekend";
    }

    public String getActeurNaam() {
        if (acteur.naam.isEmpty()) return "onbekend";
        return acteur.naam;
    }

    public String getActriceNaam() {
        if (actrice.naam.isEmpty()) return "onbekend";
        return actrice.naam;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }

    public void setActrice(Acteur actrice) {
        this.actrice = actrice;
    }
}
