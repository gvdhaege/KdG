public class Tijd {
    private int minuten;
    private int seconden;
    private int duizendsten;

    public Tijd(int minuten, int seconden, int duizendsten) {
        this.minuten = minuten;
        this.seconden = seconden;
        this.duizendsten = duizendsten;
    }

    public int naarInt() {
        return duizendsten + 1000 * seconden + 100000 * minuten;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d.%03d", minuten, seconden, duizendsten);
    }
}