package be.kdg.formule;

/*
    De klasse Tijd bevat 3 int-attributen met de namen minuten, seconden en duizendsten.
    Voorzie een constructor om alle 3 de attributen een waarde te geven.
    Voorzie een methode naarInt waarin je de tijd omzet naar een int. Bv 1min 54sec 53 duizendsten 154053.
    Voorzie een methode toString waarin je de tijd in de vorm x:xx.xxx als een String teruggeeft.
 */
public class Tijd {
    private int minuten;
    private int seconden;
    private int duizendsten;

    public Tijd(int minuten, int seconden, int duizendsten) {
        this.minuten = minuten;
        this.seconden = seconden;
        this.duizendsten = duizendsten;
    }

     public int naarInt() {
        return duizendsten + 1000 * seconden + 100000 * minuten;
    }

    public String toString() {
        return String.format("%d:%02d.%03d", minuten, seconden, duizendsten);
    }

}
