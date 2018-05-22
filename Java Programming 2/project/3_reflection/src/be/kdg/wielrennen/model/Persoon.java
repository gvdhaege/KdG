package be.kdg.wielrennen.model;

import be.kdg.wielrennen.reflection.CanRun;

import java.time.LocalDate;

public class Persoon {
    protected String naam;
    protected String voornaam;
    protected LocalDate geboorteDatum;
    protected int lengte;
    protected double gewicht;
    private String nationaliteit;

    public String getNaam() {
        return naam;
    }

    @CanRun
    public void setNaam(String naam) {
        if (!naam.isEmpty()) {
            this.naam = naam;
        } else {
            throw new IllegalArgumentException("Naam is een verplicht veld");
        }
    }

    public String getVoornaam() {
        return voornaam;
    }

    @CanRun
    public void setVoornaam(String voornaam) {
        if (!voornaam.isEmpty()) {
            this.voornaam = voornaam;
        } else {
            throw new IllegalArgumentException("Voornaam is een verplicht veld");
        }
    }

    public String getNationaliteit() {
        return nationaliteit.toUpperCase();
    }

    @CanRun
    public void setNationaliteit(String nationaliteit) {
        if (!nationaliteit.isEmpty()) {
            this.nationaliteit = nationaliteit.toUpperCase();
        } else {
            throw new IllegalArgumentException("Nationaliteit is een verplicht veld");
        }
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        if (geboorteDatum.isBefore(LocalDate.now())) {
            this.geboorteDatum = geboorteDatum;
        } else {
            throw new IllegalArgumentException("Geboortedatum moet in het verleden liggen");
        }
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        if (lengte > 50 && lengte < 250) {
            this.lengte = lengte;
        } else {
            throw new IllegalArgumentException("Lengte moet tussen 50cm en 250cm liggen");
        }
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        if (gewicht > 20.0 && gewicht < 150.0) {
            this.gewicht = gewicht;
        } else {
            throw new IllegalArgumentException("Gewicht moet tussen 20.0kg en 150.0kg liggen");
        }
    }
}
