package be.kdg.wielrennen.model;

import be.kdg.wielrennen.reflection.CanRun;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

public class WielRenner extends Persoon implements Comparable<WielRenner> {
    private static final String ONGEKEND = "Ongekend";
    private String ploeg;
    private Discipline discipline;

    public WielRenner() {
        this(ONGEKEND, ONGEKEND, ONGEKEND.toUpperCase(), LocalDate.of(2000, 1, 1), 170,
                70.0, ONGEKEND, Discipline.RACE);
    }

    public WielRenner(String naam, String voornaam, String nationaliteit, LocalDate geboorteDatum, int lengte,
                      double gewicht, String ploeg, Discipline discipline) {
        setNaam(naam);
        setVoornaam(voornaam);
        setNationaliteit(nationaliteit);
        setGeboorteDatum(geboorteDatum);
        setLengte(lengte);
        setGewicht(gewicht);
        setPloeg(ploeg);
        setDiscipline(discipline);
    }

    public String getPloeg() {
        return ploeg;
    }

    @CanRun
    public void setPloeg(String ploeg) {
        this.ploeg = ploeg;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
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
