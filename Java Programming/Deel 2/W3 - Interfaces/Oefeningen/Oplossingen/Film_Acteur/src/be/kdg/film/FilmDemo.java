package be.kdg.film;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class FilmDemo {
    public static void main(String[] args) {
        Film silence = new Film("The silence of the lambs", 1991, "Anthony Hopkins", "Jodie Foster");
        toonFilm(silence);

        Film sleepless = new Film("Extremely Loud and Incredibly Close", 2011);
        toonFilm(sleepless);

        Film gravity = new Film("Gravity");
        toonFilm(gravity);

        // externe creatie acteur objecten
        Film.Acteur acteur = gravity.new Acteur("George Clooney");
        Film.Acteur actrice = gravity.new Acteur("Sandra Bullock");

        gravity.setJaar(2013);
        gravity.setActeur(acteur);
        gravity.setActrice(actrice);
        toonFilm(gravity);

        Film onbekend = new Film();
        Film.Acteur nieuw = onbekend.new Acteur("Vin Diesel");
        onbekend.setActeur(nieuw);
        nieuw.setTitel("Fast & Furious 6");
        toonFilm(onbekend);
    }

    private static void toonFilm(Film gravity) {
        System.out.println("Titel: " + gravity.getTitel());
        System.out.println("Jaar: " + gravity.getJaar());
        System.out.println("Cast: " + gravity.getActeurNaam() + " - " + gravity.getActriceNaam() + "\n");
    }
}

/*
Titel: The silence of the lambs
Jaar: 1991
Cast: Anthony Hopkins - Jodie Foster

Titel: Extremely Loud and Incredibly Close
Jaar: 2011
Cast: onbekend - onbekend

Titel: Gravity
Jaar: onbekend
Cast: onbekend - onbekend

Titel: Gravity
Jaar: 2013
Cast: George Clooney - Sandra Bullock

Titel: Fast & Furious 6
Jaar: onbekend
Cast: Vin Diesel - onbekend
*/