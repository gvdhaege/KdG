package kaart;

import java.util.Random;

public class SpeelKaart {
    public enum KaartKleur {
        HARTEN, SCHOPPEN, RUITEN, KLAVEREN;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public enum KaartWaarde {
        TWEE(2), DRIE(3), VIER(4), VIJF(5), ZES(6),
        ZEVEN(7), ACHT(8), NEGEN(9), TIEN(10),
        BOER(10), DAME(10), HEER(10), AAS(1);
        private int waarde;

        KaartWaarde(int waarde) {
            this.waarde = waarde;
        }

        public int getWaarde() {
            return waarde;
        }

        @Override
        public String toString() {
            return name().toLowerCase();
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
        return waarde.getWaarde();
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

    public String toonWaarde(){
        String value = waarde.name().toLowerCase();
        if (waarde.ordinal() < 9){
            value = Integer.toString(waarde.getWaarde());
        }
        return kleur + " " + value;
    }

    @Override
    public String toString() {
        return kleur + " " + waarde;
    }
}
