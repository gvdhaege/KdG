package be.kdg.sorteerbaar.extra;

public final class Kampioen implements Sorteerbaar {
    private final String voornaam;
    private final String naam;
    private final String team;

    public Kampioen(String voornaam, String naam, String team) {
        this.voornaam = voornaam;
        this.naam = naam;
        this.team = team;
    }

    public boolean kleinerDan(Sorteerbaar sorteerbaar) {
        return naam.compareTo(((Kampioen) sorteerbaar).naam) < 0;
    }

    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return naam.compareTo(((Kampioen) sorteerbaar).naam) > 0;
    }

    @Override
    public String toString() {
        return String.format("%-20s %s", voornaam + " " + naam, team);
    }
}
