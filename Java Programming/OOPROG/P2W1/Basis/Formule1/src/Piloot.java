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

    @Override
    public String toString() {
        return "Piloot{" +
                "naam='" + naam + '\'' +
                ", team='" + team + '\'' +
                ", tijd=" + tijd +
                '}';
    }
}
