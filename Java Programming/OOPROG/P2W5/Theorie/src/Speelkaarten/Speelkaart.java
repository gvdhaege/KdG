package Speelkaarten;

public class Speelkaart {
    public enum Kleur {Harten, Ruiten, Schoppen, Klaveren}

    public enum Waarde {aas, twee, drie, vier, vijf, zes, zeven, acht, negen, tien, boer, vrouw, heer}

    private final Kleur kleur;
    private final Waarde waarde;

    public Speelkaart(Kleur kleur, Waarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public Waarde getWaarde() {
        return waarde;
    }

    @Override
    public String toString() {
        return kleur + " " + waarde;
    }
}
