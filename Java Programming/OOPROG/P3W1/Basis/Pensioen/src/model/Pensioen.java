package model;

public class Pensioen {
    private static final int PENSIOEN_LEEFTIJD = 65;
    private int geboorteJaar;

    public void setGeboorteJaar(int geboorteJaar) {
        this.geboorteJaar = geboorteJaar;
    }

    public int getPensioenJaar() {
        return this.geboorteJaar + PENSIOEN_LEEFTIJD;
    }
}
