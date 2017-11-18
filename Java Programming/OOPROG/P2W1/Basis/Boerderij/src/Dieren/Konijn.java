package Dieren;

public class Konijn extends Dier {
    private boolean isGraver;

    public Konijn(String naam, boolean isGraver) {
        super(naam, "Snifsnif", "gras");
        this.isGraver = isGraver;
    }

    @Override
    public String toString() {
        return super.toString() + " en graaft " + (isGraver ? "wel" : "niet");
    }
}
