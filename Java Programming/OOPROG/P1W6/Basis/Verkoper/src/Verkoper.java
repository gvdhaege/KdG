public class Verkoper {
    private String naam;
    private int[] verkoopCijfers;

    public Verkoper(String naam) {
        this.naam = naam;
        verkoopCijfers = new int[12];
    }

    public void setVerkoopCijfers(int[] verkoopCijfers) {
        this.verkoopCijfers = verkoopCijfers;
    }

    public int verkoopTotaal() {
        int som = 0;
        for (int verkoopSom : verkoopCijfers) {
            som += verkoopSom;
        }
        return som;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nVerkoopcijfers van " + naam + ": ");

        for (int verkoopSom : verkoopCijfers) {
            builder.append(verkoopSom).append(" ");
        }
        builder.append("\nTotaal: ").append(verkoopTotaal());
        return builder.toString();
    }
}
