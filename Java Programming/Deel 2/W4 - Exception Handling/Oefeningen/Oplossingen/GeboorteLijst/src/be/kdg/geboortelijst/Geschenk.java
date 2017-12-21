package be.kdg.geboortelijst;

import be.kdg.geboortelijst.exception.GeschenkException;

/**
 * Mark Goovaerts
 * Datum: 2-12-13
 */
public class Geschenk {
    private String naam;
    private double prijs;
    private String koper;

    public Geschenk(String naam, double prijs) {
        setNaam(naam);
        setPrijs(prijs);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam.isEmpty()) {
            throw new IllegalArgumentException("Lege naam");
        }
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        if (prijs < 0) {
            throw new IllegalArgumentException("Negatieve prijs");
        }
        this.prijs = prijs;
    }

    public String getKoper() {
        return koper;
    }

    public void setKoper(String koper) throws GeschenkException {
        if(koper.isEmpty()) {
            throw new IllegalArgumentException("Naam van de koper is leeg");
        }
        if(this.koper != null) {
            throw new GeschenkException("Geschenk is al gekocht door " + this.koper);
        }
        this.koper = koper;
    }

    @Override
    public String toString() {
        return String.format("%-20s €%.2f %s",
                naam, prijs, koper == null ? "" : " gekocht door: " + koper);
    }
}
