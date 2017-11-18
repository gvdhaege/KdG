package be.kdg.mandje;

/*
De klasse Artikel bevat twee attributen, met name artikel (type Artikel) en aantal (type int).
Voorzie een constructor met twee parameters die beide attributen een waarde geeft.
Voorzie getters voor beide attributen.
Voorzie een toString-methode die alle informatie over het artikel gevolgd door het aantal als een string teruggeeft. (zie uitvoer)
Voorzie een methode totaalExclusief die het totale bedrag zonder BTW als een double teruggeeft (prijs * aantal).
Voorzie een methode totaalBtw die het BTW bedrag als een double teruggeeft.
Voorzie een methode totaalInclusief die het totale bedrag inclusief taksen of btw teruggeeft.
Voorzie een methode toon die een aankoopregel in de factuur afdrukt (zie uitvoer)
 */
public class Aankoop {
    private Artikel artikel;
    private int aantal;

    public Aankoop(Artikel artikel, int aantal) {
        this.artikel = artikel;
        this.aantal = aantal;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getAantal() {
        return aantal;
    }

    @Override
    public String toString() {
        return artikel.toString() + "\naantal: " + aantal;
    }

    public double totaalExclusief() {
        return artikel.getPrijs() * aantal;
    }

    public double totaalBtw() {
        return totaalInclusief() - totaalExclusief();
    }

    public double totaalInclusief() {
        return artikel.getTotalePrijs() * aantal;
    }

    public void toon() {
        System.out.printf("%-40s  aantal: %2s  prijs: €%6.2f  btw: €%5.2f  totaal: €%6.2f\n",
                artikel.getOmschrijving(), aantal, totaalExclusief(), totaalBtw(), totaalInclusief());
    }
}
