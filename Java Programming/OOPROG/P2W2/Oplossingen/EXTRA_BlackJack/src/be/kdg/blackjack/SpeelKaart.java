package be.kdg.blackjack;

import java.util.Random;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

public class SpeelKaart {
    public enum KaartKleur {
        HARTEN("harten"), SCHOPPEN("schoppen"), RUITEN("ruiten"), KLAVEREN("klaveren");

        private String naam;

        private KaartKleur(String naam) {
            this.naam = naam;
        }

        @Override
        public String toString() {
            return naam;
        }
    }

    public enum KaartWaarde {
        TWEE("twee", 2), DRIE("drie", 3), VIER("vier", 4),
        VIJF("vijf", 5), ZES("zes", 6), ZEVEN("zeven", 7),
        ACHT("acht", 8), NEGEN("negen", 9), TIEN("tien", 10),
        BOER("boer", 10), DAME("dame", 10), HEER("heer", 10), AAS("aas", 1);

        private String naam;
        private int waarde;

        private KaartWaarde(String naam, int waarde) {
            this.naam = naam;
            this.waarde = waarde;
        }

        @Override
        public String toString() {
            return naam;
        }

        public int getKaartWaarde() {
            return waarde;
        }
    }

    private static final Random random = new Random();

    private KaartKleur kleur;
    private KaartWaarde waarde;

    public SpeelKaart(KaartKleur kleur, KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public KaartKleur getKleur() {
        return kleur;
    }

    public KaartWaarde getWaarde() {
        return waarde;
    }

    public int getGetalWaarde() {
        return waarde.getKaartWaarde();
    }

    public void setKaart(KaartKleur kleur, KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public void maakWillekeurigeKaart() {
        KaartKleur[] kleuren = KaartKleur.values();
        kleur = kleuren[random.nextInt(kleuren.length)];

        KaartWaarde[] waarden = KaartWaarde.values();
        waarde = waarden[random.nextInt(waarden.length)];
    }

    public String toString() {
        return kleur + " " + waarde;
    }

    public String toonKaart() {
        String deWaarde = waarde.toString();
        if (waarde.ordinal() < 9) {
            deWaarde = Integer.toString(waarde.getKaartWaarde());
        }
        return kleur + " " + deWaarde;
    }
}
