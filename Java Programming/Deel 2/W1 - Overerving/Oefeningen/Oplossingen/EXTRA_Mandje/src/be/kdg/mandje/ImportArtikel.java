package be.kdg.mandje;

/*
De klasse ImportArtikel erft over van de klasse Artikel.
Er is slechts één attribuut, met name invoerTaks van het typ double.
Voorzie een constructor met 5 parameters, 4 voor het Artikel-object en 1 (las laatste) voor de invoerTaks.
Voorzie een getter voor invoerTaks.
Voorzie een toString-methode die alle informatie over een object van deze klasse als een string teruggeeft. (zie uitvoer).
 */
public class ImportArtikel extends Artikel {
    private double invoerTaks;


    public ImportArtikel(int nummer, String omschrijving, double prijs,
                         int btwTarief, double invoerTaks) {
        super(nummer, omschrijving, prijs, btwTarief);
        this.invoerTaks = invoerTaks;
    }

    @Override
    public double getInvoerTaks() {
        return invoerTaks;
    }

    @Override
    public String toString() {
        return super.toString() + "€" + invoerTaks;
    }
}

