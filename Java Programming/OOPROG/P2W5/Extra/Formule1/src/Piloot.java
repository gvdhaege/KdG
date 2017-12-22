public class Piloot implements Comparable<Piloot>{
    private String naam;
    private String team;
    private Tijd tijd;

    public Piloot(String naam, String team) {
        this.naam = naam;
        this.team = team;
    }

    public void setTijd(Tijd tijd) {
        this.tijd = tijd;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %s", naam, team, tijd);
    }

    @Override
    public int compareTo(Piloot anderePiloot) {
        return this.tijd.naarInt() - anderePiloot.tijd.naarInt();
    }
}
