package be.kdg.sitebezoek;

import java.util.Random;

/*
    De klasse Tijd bevat 4 int-attributen met de namen uren, minuten, seconden en honderdsten.
    Verder is er nog een private static Random met de naam Random. waar je meteen een nieuw Random object aan toekent.
    Voorzie een lege default constructor en een constructor om alle 4 de attributen een waarde te geven.
    Voorzie getters voor alle int attributen.
    Voorzie een methode toInteger waarin je de tijd omzet naar een int. Bv 2u 13min 54sec 15 honderdsten wordt het getal 2135415.
    Voorzie een methode toString waarin je de tijd in de vorm x:xx:xx.xx als een String teruggeeft.
    Voorzie een methode maakRandomTijd waarmee je de 4 atttributen een willekeurige waarde kunt geven.
 */
public class Tijd {
    private static final Random random = new Random();

    private int uren;
    private int minuten;
    private int seconden;
    private int honderdsten;

    public Tijd() {
    }

    public Tijd(int uren, int minuten, int seconden, int honderdsten) {
        this.uren = uren;
        this.minuten = minuten;
        this.seconden = seconden;
        this.honderdsten = honderdsten;
    }

    public int getUren() {
        return uren;
    }

    public int getMinuten() {
        return minuten;
    }

    public int getSeconden() {
        return seconden;
    }

    public int getHonderdsten() {
        return honderdsten;
    }

    public String toString() {
        return String.format("%2d:%02d:%02d.%02d", uren, minuten, seconden, honderdsten);
    }

    public int toInteger() {
        return honderdsten + 100 * seconden + 10000 * minuten + 1000000 * uren;
    }

    public void maakRandomTijd() {
        uren = random.nextInt(24);
        minuten = random.nextInt(60);
        seconden = random.nextInt(60);
        honderdsten = random.nextInt(100);
    }

}
