package be.kdg.leden;

/*
Vul deze enum aan .... .
 */
public enum Soort {
    GEWOON("gewoon"),
    STEUNEND("steunend"),
    ERELID("erelid");

    private final String soort;

    Soort(String soort) {
        this.soort = soort;
    }

    @Override
    public String toString() {
        return soort;
    }
}
