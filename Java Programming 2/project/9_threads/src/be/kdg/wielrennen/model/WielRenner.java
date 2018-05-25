package be.kdg.wielrennen.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

public final class WielRenner implements Comparable<WielRenner> {
    private static final String ONGEKEND = "Ongekend";
    private final String naam;
    private final String voornaam;
    private final String nationaliteit;
    private final LocalDate geboorteDatum;
    private final int lengte;
    private final double gewicht;
    private final String ploeg;
    private final Discipline discipline;

    public WielRenner() {
        this(ONGEKEND, ONGEKEND, ONGEKEND.toUpperCase(), LocalDate.of(2000, 1, 1), 170,
                70.0, ONGEKEND, Discipline.RACE);
    }

    public WielRenner(String naam, String voornaam, String nationaliteit, LocalDate geboorteDatum, int lengte,
                      double gewicht, String ploeg, Discipline discipline) {
        if (!naam.isEmpty()) {
            this.naam = naam;
        } else {
            throw new IllegalArgumentException("Naam is een verplicht veld");
        }
        if (!voornaam.isEmpty()) {
            this.voornaam = voornaam;
        } else {
            throw new IllegalArgumentException("Voornaam is een verplicht veld");
        }
        if (!nationaliteit.isEmpty()) {
            this.nationaliteit = nationaliteit.toUpperCase();
        } else {
            throw new IllegalArgumentException("Nationaliteit is een verplicht veld");
        }
        if (geboorteDatum.isBefore(LocalDate.now())) {
            this.geboorteDatum = geboorteDatum;
        } else {
            throw new IllegalArgumentException("Geboortedatum moet in het verleden liggen");
        }
        if (lengte > 50 && lengte < 250) {
            this.lengte = lengte;
        } else {
            throw new IllegalArgumentException("Lengte moet tussen 50cm en 250cm liggen");
        }
        if (gewicht > 20.0 && gewicht < 150.0) {
            this.gewicht = gewicht;
        } else {
            throw new IllegalArgumentException("Gewicht moet tussen 20.0kg en 150.0kg liggen");
        }
        this.ploeg = ploeg;
        this.discipline = Discipline.valueOf(discipline.name());
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNationaliteit() {
        return nationaliteit.toUpperCase();
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public int getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getPloeg() {
        return ploeg;
    }

    public Discipline getDiscipline() {
        return Discipline.valueOf(discipline.name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WielRenner that = (WielRenner) o;
        return Objects.equals(naam, that.naam) &&
                Objects.equals(voornaam, that.voornaam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, voornaam);
    }

    @Override
    public int compareTo(WielRenner o) {
        return Comparator.comparing(WielRenner::getNaam)
                .thenComparing(WielRenner::getVoornaam)
                .compare(this, o);
    }

    @Override
    public String toString() {
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatGeboorteDatum = geboorteDatum.format(fm);
        return String.format("%-15s %-10s %-12s (%-3dcm - %3.2fkg)\tgeboortedatum: %-12s ploeg: %-25s", naam, voornaam, getNationaliteit(),
                lengte, gewicht, formatGeboorteDatum, ploeg);
    }
}
