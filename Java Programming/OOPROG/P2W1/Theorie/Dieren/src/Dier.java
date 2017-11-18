public class Dier {
    private String naam;
    private String ras;
    private String kleur;
    private String slogan;



    public Dier(String naam, String ras, String kleur, String slogan) {
        this.naam = naam;
        this.ras = ras;
        this.kleur = kleur;
        this.slogan = slogan;
    }

    public String toString(){
        return "Naam: " + naam;
    }
}
