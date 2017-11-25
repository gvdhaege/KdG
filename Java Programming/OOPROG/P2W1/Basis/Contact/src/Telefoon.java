public class Telefoon {
    private static final int CIJFERS_VAST_NUMMER = 9;
    private static final int CIJFERS_MOBIEL_NUMMER = 10;

    private String soort;
    private String nummer;

    public Telefoon(String soort, String nummer) {
        this.soort = soort;
        this.nummer = nummer;
    }

    public String getSoort() {
        return soort;
    }

    public String getNummer() {
        return nummer;
    }

    public boolean isGeldigNummer() {
        if (nummer.startsWith("0")) {
            int aantalCijfers;
            if (soort.equals("vast")) {
                aantalCijfers = CIJFERS_VAST_NUMMER;
            } else {
                aantalCijfers = CIJFERS_MOBIEL_NUMMER;
            }
            return aantalCijfers == nummer.length();
        }
        return false;
    }
}
