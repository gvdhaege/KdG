package be.kdg.wielrennen.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WielRenner implements Comparable<WielRenner> {
    private static final Logger logger = Logger.getLogger("be.kdg.wielrennen.model.WielRenner");
    private static final String ONGEKEND = "Ongekend";
    private String naam;
    private String voornaam;
    private String nationaliteit;
    private LocalDate geboorteDatum;
    private int lengte;
    private double gewicht;
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

    public String getNaam() {
        return naam != null ? naam : ONGEKEND;
    }

    public void setNaam(String naam) {
        if (!naam.isEmpty()) {
            this.naam = naam;
        } else {
            logger.severe("Naam is een verplicht veld");
            throw new IllegalArgumentException("Naam is een verplicht veld");
        }
    }

    public String getVoornaam() {
        return voornaam != null ? voornaam : ONGEKEND;
    }

    public void setVoornaam(String voornaam) {
        if (!voornaam.isEmpty()) {
            this.voornaam = voornaam;
        } else {
            logger.severe("Voornaam is een verplicht veld");
            throw new IllegalArgumentException("Voornaam is een verplicht veld");
        }
    }

    public String getNationaliteit() {
        return nationaliteit != null ? nationaliteit.toUpperCase() : ONGEKEND.toUpperCase();
    }

    public void setNationaliteit(String nationaliteit) {
        if (!nationaliteit.isEmpty()) {
            this.nationaliteit = nationaliteit.toUpperCase();
        } else {
            logger.severe("Nationaliteit is een verplicht veld");
            throw new IllegalArgumentException("Nationaliteit is een verplicht veld");
        }
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum != null ? geboorteDatum : LocalDate.of(2000, 1, 1);
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        if (geboorteDatum.isBefore(LocalDate.now())) {
            this.geboorteDatum = geboorteDatum;
        } else {
            logger.log(Level.SEVERE, "Geboortedatum {0} ligt niet in het verleden voor {1} {2}", new Object[]{geboorteDatum, voornaam, naam});
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
            logger.log(Level.SEVERE, "Lengte {0} ligt niet tussen 50 en 250cm voor {1} {2}", new Object[]{lengte, voornaam, naam});
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
            logger.log(Level.SEVERE, "Gewicht {0} ligt niet tussen 20 en 150 voor {1} {2}", new Object[]{gewicht, voornaam, naam});
            throw new IllegalArgumentException("Gewicht moet tussen 20.0kg en 150.0kg liggen");
        }
    }

    public String getPloeg() {
        return ploeg != null ? ploeg : ONGEKEND;
    }

    public void setPloeg(String ploeg) {
        this.ploeg = ploeg;
    }

    public Discipline getDiscipline() {
        return discipline != null ? discipline : Discipline.RACE;
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
