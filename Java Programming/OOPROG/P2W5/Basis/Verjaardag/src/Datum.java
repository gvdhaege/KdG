public class Datum implements Comparable<Datum> {
    public enum Maand {
        JANUARI, FEBRUARI, MAART, APRIL, MEI, JUNI, JULI, AUGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DECEMBER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
    private int dag;
    private Maand maand;

    public Datum(int dag, Maand maand) {
        this.dag = dag;
        this.maand = maand;
    }

    @Override
    public String toString() {
        return String.format("%2d %-4s", dag, maand);
    }

    @Override
    public int compareTo(Datum andereDatum){
        int verschil = maand.compareTo(andereDatum.maand);
        if (verschil != 0){
            return verschil;
        }
        return dag - andereDatum.dag;
    }
}
