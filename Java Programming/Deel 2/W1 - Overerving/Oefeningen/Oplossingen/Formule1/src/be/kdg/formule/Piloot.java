package be.kdg.formule;

public class Piloot {
    private String naam;
    private String team;
    private Tijd tijd;

    public Piloot(String naam, String team) {
        this.naam = naam;
        this.team = team;
    }

    public Tijd getTijd() {
        return tijd;
    }

    public void setTijd(Tijd tijd) {
        this.tijd = tijd;
    }

    public String toString() {
        return String.format("%-20s %-20s %s", naam, team, tijd);
    }
}
