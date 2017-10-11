public class Rechthoek {
    private int breedte;
    private int hoogte;

    public int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public double oppervlakte() {
        return breedte * hoogte;
    }

    public double omtrek() {
        return 2 * (breedte + hoogte);
    }
}