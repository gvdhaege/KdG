package leden;

public enum Soort {
    GEWOON("gewoon"), STEUNEND("steunend"), ERELID("erelid");

    private String soort;

    Soort(String soort) {
        this.soort = soort;
    }

    @Override
    public String toString() {
        return soort;
    }
}
