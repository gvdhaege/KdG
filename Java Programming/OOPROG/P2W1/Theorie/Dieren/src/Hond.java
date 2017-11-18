public class Hond extends Dier{
    private final String chipnummer = "A54780";

    public Hond(String naam, String ras, String kleur, String slogan) {
        super(naam, ras, kleur, slogan);
    }

    public String getChipnummer() {
        return chipnummer;
    }
}
