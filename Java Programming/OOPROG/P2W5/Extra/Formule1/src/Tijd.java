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
        String tijd = "" + minuten + seconden + duizendsten;
        return Integer.parseInt(tijd);
    }

    @Override
    public String toString() {
        return String.format("%1d:%2d.%3d", minuten, seconden, duizendsten);
    }
}
