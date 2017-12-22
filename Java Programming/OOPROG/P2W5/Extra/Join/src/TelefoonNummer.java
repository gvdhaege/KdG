public class TelefoonNummer {
    private String zoneGetal;
    private String nummer;

    public TelefoonNummer(String zoneGetal, String nummer) {
        this.zoneGetal = zoneGetal;
        this.nummer = nummer;
    }

    public String formatterNummer() {
        if (zoneGetal.length() > 2) {
            return nummer.substring(0, 2)
                    + "."
                    + nummer.substring(2, 4)
                    + "."
                    + nummer.substring(4, 6);
        } else {
            return nummer.substring(0, 3)
                    + "."
                    + nummer.substring(3, 5)
                    + "."
                    + nummer.substring(5, 7);
        }
    }

    @Override
    public String toString() {
        return zoneGetal + "/" + formatterNummer();
    }
}
