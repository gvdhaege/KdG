public class RechthoekigeDriehoek {
    private int basis;
    private int hoogte;

    public int getBasis() {
        return basis;
    }

    public void setBasis(int basis) {
        this.basis = basis;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public double oppervlakte() {
        return basis * hoogte / 2;
    }

    public double omtrek() {
        return basis + hoogte + Math.sqrt(basis * basis + hoogte * hoogte);
    }
}