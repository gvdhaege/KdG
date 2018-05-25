package be.kdg.wielrennen.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

/**
 * De klasse WielRenner beschrijft alle karakteristieken van een wielrenner,
 * alsook in welke discipline deze renner voornamelijk actief is en zijn meest recente ploeg.
 *
 * @author Steven Excelmans
 * @version 1.0
 */
public class WielRenner implements Comparable<WielRenner> {
    private static final String ONGEKEND = "Ongekend";
    private String naam;
    private String voornaam;
    private String nationaliteit;
    private LocalDate geboorteDatum;
    private int lengte;
    private double gewicht;
    private String ploeg;
    private Discipline discipline;

    /**
     * Constructor om een WielRenner object aan te maken met standaard waarden.
     */
    public WielRenner() {
        this(ONGEKEND, ONGEKEND, ONGEKEND.toUpperCase(), LocalDate.of(2000, 1, 1), 170,
                70.0, ONGEKEND, Discipline.RACE);
    }

    /**
     * Constructor om een WielRenner object aan te maken met specifiek opgegeven waarden.
     *
     * @param naam          de naam van de wielrenner
     * @param voornaam      de voornaam van de wielrenner
     * @param nationaliteit de nationaliteit van de wielrenner
     * @param geboorteDatum de geboortedatum van de wielrenner
     * @param lengte        de lengte van de wielrenner uitgedrukt in cm
     * @param gewicht       het gewicht van de wielrenner uitgedrukt in kg
     * @param ploeg         de huidige (of laatste actieve) ploeg van de wielrenner
     * @param discipline    de hoofd discipline waarin deze wielrenner actief is
     * @throws IllegalArgumentException als naam niet ingevuld is
     * @throws IllegalArgumentException als voornaam niet ingevuld is
     * @throws IllegalArgumentException als nationaliteit niet ingevuld is
     * @throws IllegalArgumentException als de geboortedatum niet in het verleden ligt
     * @throws IllegalArgumentException als de lengte niet tussen 50 en 250cm ligt
     * @throws IllegalArgumentException als het gewicht niet tussen 20 en 150kg ligt
     */
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

    /**
     * @return de naam van de wielrenner
     */
    String getNaam() {
        return naam;
    }

    /**
     * Stelt de naam van de wielrenner in.
     *
     * @param naam de naam van de wielrenner
     */
    public void setNaam(String naam) {
        if (!naam.isEmpty()) {
            this.naam = naam;
        } else {
            throw new IllegalArgumentException("Naam is een verplicht veld");
        }
    }

    /**
     * @return de voornaam van de wielrenner
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Stelt de voornaam van de wielrenner in.
     *
     * @param voornaam de voornaam van de wielrenner
     */
    public void setVoornaam(String voornaam) {
        if (!voornaam.isEmpty()) {
            this.voornaam = voornaam;
        } else {
            throw new IllegalArgumentException("Voornaam is een verplicht veld");
        }
    }

    /**
     * @return de nationaliteit van de wielrenner
     */
    public String getNationaliteit() {
        return nationaliteit.toUpperCase();
    }

    /**
     * Stelt de nationaliteit van de wielrenner in.
     *
     * @param nationaliteit de nationaliteit van de wielrenner
     */
    public void setNationaliteit(String nationaliteit) {
        if (!nationaliteit.isEmpty()) {
            this.nationaliteit = nationaliteit.toUpperCase();
        } else {
            throw new IllegalArgumentException("Nationaliteit is een verplicht veld");
        }
    }

    /**
     * @return de geboortedatum van de wielrenner
     */
    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    /**
     * Stelt de geboortedatum van de wielrenner in.
     *
     * @param geboorteDatum de geboortedatum van de wielrenner
     */
    public void setGeboorteDatum(LocalDate geboorteDatum) {
        if (geboorteDatum.isBefore(LocalDate.now())) {
            this.geboorteDatum = geboorteDatum;
        } else {
            throw new IllegalArgumentException("Geboortedatum moet in het verleden liggen");
        }
    }

    /**
     * @return de lengte van de wielrenner in cm
     */
    public int getLengte() {
        return lengte;
    }

    /**
     * Stelt de lengte van de wielrenner in.
     *
     * @param lengte de lengte van de wielrenner, uitgedrukt in cm
     */
    public void setLengte(int lengte) {
        if (lengte > 50 && lengte < 250) {
            this.lengte = lengte;
        } else {
            throw new IllegalArgumentException("Lengte moet tussen 50cm en 250cm liggen");
        }
    }

    /**
     * @return het gewicht van de wielrenner
     */
    public double getGewicht() {
        return gewicht;
    }

    /**
     * Stelt het gewicht van de wielrenner in.
     *
     * @param gewicht het gewicht van de wielrenner, uitgedrukt in kg
     */
    public void setGewicht(double gewicht) {
        if (gewicht > 20.0 && gewicht < 150.0) {
            this.gewicht = gewicht;
        } else {
            throw new IllegalArgumentException("Gewicht moet tussen 20.0kg en 150.0kg liggen");
        }
    }

    /**
     * @return de ploeg van de wielrenner
     */
    public String getPloeg() {
        return ploeg;
    }

    /**
     * Stelt de ploeg van de wielrenner in.
     *
     * @param ploeg de ploeg van de wielrenner
     */
    public void setPloeg(String ploeg) {
        this.ploeg = ploeg;
    }

    /**
     * @return de discipline van de wielrenner
     */
    public Discipline getDiscipline() {
        return discipline;
    }

    /**
     * Stelt de discipline van de wielrenner in.
     *
     * @param discipline de discipline van de wielrenner
     */
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
