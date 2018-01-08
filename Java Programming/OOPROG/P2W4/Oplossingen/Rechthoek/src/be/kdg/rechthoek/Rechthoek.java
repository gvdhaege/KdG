package be.kdg.rechthoek;

public class Rechthoek {
    private int breedte;
    private int hoogte;

    public Rechthoek() throws NegativeSizeException { //verplicht bij checked exception
        this(0, 0);
    }

    public Rechthoek(int breedte, int hoogte) throws NegativeSizeException {
        setBreedte(breedte);
        setHoogte(hoogte);
    }

    public void setBreedte(int breedte) throws NegativeSizeException {
        if (breedte < 0) {
            throw new NegativeSizeException("Fout bij creatie object: negatieve breedte");
        }
        this.breedte = breedte;
    }

    public void setHoogte(int hoogte) throws NegativeSizeException {
        if (hoogte < 0) {
            throw new NegativeSizeException("Fout bij creatie object: negatieve hoogte");
        }
        this.hoogte = hoogte;
    }

    @Override
    public String toString() {
        return "Rechthoek{" +
                "breedte=" + breedte +
                ", hoogte=" + hoogte +
                '}';
    }
}
