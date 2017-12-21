package be.kdg.auteur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Vul de constructor in deze klasse aan zodat de gewenste afdruk bekomen wordt.
  */
public class Auteur {
    private String naam;
    private long geboorteDatum;
    private String[] boeken;

    /**
     * Maakt een Auteur object. Het object kan alleen gemaakt worden als
     * alle parameters geldig zijn.
     *
     * @param naam De naam van de auteur, mag niet null of leeg zijn
     * @param geboortedatum De geboortedatum van de auteur,
     *                      moet in het verleden liggen
     * @param boeken Een lijst van boeken, mag niet null of leeg zijn
     *
     * @throws IllegalArgumentException bij een foutieve parameter
     */
    public Auteur(String naam, long geboortedatum, String[] boeken) {
        if (stringIsNullOrEmpty(naam)) {
            throw new IllegalArgumentException("De auteurnaam is niet ingevuld");
        }
        if (geboortedatum >= System.currentTimeMillis()) {
            throw new IllegalArgumentException("De geboortedatum is foutief");
        }
        if (boeken == null || (boeken.length == 0)) {
            throw new IllegalArgumentException("De boekenlijst mag niet leeg zijn");
        }
        this.naam = naam;
        this.geboorteDatum = geboortedatum;
        this.boeken = boeken;
    }

    private boolean stringIsNullOrEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    /**
     * Geeft de inhoud van het object in de vorm van een String.
     * @return Een string
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("naam: ");
        result.append(naam);
        result.append(" - geboorteDatum: ");
        result.append(getDatumString(new Date(geboorteDatum)));
        result.append(" - boeken: ");
        for (int i = 0; i < boeken.length; i++) {
            result.append(boeken[i]);
            if (i < boeken.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    /**
     * Geeft de geboortedatum in de vorm dagnaam dag maandnaam jaar terug.
     * Voorbeeld: dinsdag 16 oktober 1928
     *
     * @param datum Een datum
     * @return Een string
     */
    public String getDatumString(Date datum) {
        SimpleDateFormat datumFormat = new SimpleDateFormat("EEEE dd MMMM yyyy");
        return datumFormat.format(datum);
    }
}

