package be.kdg.mandje;

/*
De klasse Artikel bevat de informatie over een artikel.
De attributen zijn achtereenvolgens het artikelnummer (int), de omschrijving (String), de prijs (double) en het btwTarief (dit laatste in de vorm van het percentage (type int).
Voorzie een constructor met 4 parameters, een voor elk van de attributen.
Voorzie getters voor elk van de attributen.
Voorzie een methode getTotalePrijs() die de prijs inclusief BTW teruggeeft.
Voorzie een toString-methode die alle informatie over een artikel in de vorm van een string teruggeeft (zie uitvoer)
Voorzie een methode getInvoerTaks() die de waarde 0.0 teruggeeft.
*/
public class Artikel {
    private int nummer;
    private String omschrijving;
    private double prijs;
    private int btwTarief;

    public Artikel(int nummer, String omschrijving, double prijs, int btwTarief) {
        this.nummer = nummer;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
        this.btwTarief = btwTarief;
    }

    public int getNummer() {
        return nummer;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getBtwTarief() {
        return btwTarief;
    }

    public double getTotalePrijs() {
        return prijs * (1 + btwTarief / 100.0);
    }

    @Override
    public String toString() {
        return nummer + " " + omschrijving + " €" + prijs + " " + btwTarief + "%";
    }

    public double getInvoerTaks() {
        return 0.0;
    }
}
