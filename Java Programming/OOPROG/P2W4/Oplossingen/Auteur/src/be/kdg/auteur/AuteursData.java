package be.kdg.auteur;

import java.util.GregorianCalendar;

/**
 * @author Kristiaan Behiels
 * @version 1.1 02/12/13
 */
public class AuteursData {
    public class AuteurData {
        private String naam;
        private long geboorteDatum;
        private String[] boeken;

        private AuteurData(String naam, long geboorteDatum, String[] boeken) {
            this.naam = naam;
            this.geboorteDatum = geboorteDatum;
            this.boeken = boeken;
        }

        public String getNaam() {
            return naam;
        }

        public long getGeboorteDatum() {
            return geboorteDatum;
        }

        public String[] getBoeken() {
            return boeken;
        }
    }

    String[] boekenLeeg = {};
    String[] boeken = {"De Muur", "Het Gevaar", "Het huis der onbekenden"};

    private AuteurData[] auteurs = {
            new AuteurData(null, new GregorianCalendar(3000, 5, 5).getTimeInMillis(), null),
            new AuteurData("", new GregorianCalendar(3000, 5, 5).getTimeInMillis(), null),
            new AuteurData("Jos Vandeloo", new GregorianCalendar(3000, 5, 5).getTimeInMillis(), null),
            new AuteurData("Jos Vandeloo", new GregorianCalendar(1928, 9, 16).getTimeInMillis(), null),
            new AuteurData("Jos Vandeloo", new GregorianCalendar(1928, 9, 16).getTimeInMillis(), boekenLeeg),
            new AuteurData("Jos Vandeloo", new GregorianCalendar(1928, 9, 16).getTimeInMillis(), boeken),
    };

    public AuteurData[] getAuteurs() {
        return auteurs;
    }
}
