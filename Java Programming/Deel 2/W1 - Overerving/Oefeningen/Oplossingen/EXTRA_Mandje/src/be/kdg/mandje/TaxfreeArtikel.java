package be.kdg.mandje;

/*
De klasse TaxfreeArtikel erft over van de klasse Artikel.
Er zijn geen bijkomende attributen en het BTW tarief is in dit geval altijd 0.
Voorzie een constructor met 3 parameters die nodig zijn voor de klasse Artikel.
Voorzie een methode getTotalePrijs die de methode getprijs van Artikel oproept en de waarde ervan als een double teruggeeft.
Voorzie een toString-methode om alle informatie van een object van deze klasse als een string te kunnen teruggeven.
 */
public class TaxfreeArtikel extends Artikel {

    public TaxfreeArtikel(int nummer, String omschrijving, double prijs) {
        super(nummer, omschrijving, prijs, 0);
    }

    @Override
    public double getTotalePrijs() {
        return getPrijs();
    }

    @Override
    public String toString() {
        return getNummer() + " " + getOmschrijving() + " €" + getPrijs();
    }
}

