
public class Bord {
    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur) {
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    public double oppervlakte(){
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-7s", materiaal, kleur);
    }
}
