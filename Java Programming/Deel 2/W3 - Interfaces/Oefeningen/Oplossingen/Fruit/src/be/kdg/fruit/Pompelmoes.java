package be.kdg.fruit;

/**
 * De klasse Pompelmoes is een uitbreiding van de klasse Fruit.
 * Ze heeft een extra attribuut van het type String om de
 * kleur van de pompelmoessoort aan te duiden.
 */
public class Pompelmoes extends Fruit {
    private String kleur;

    public Pompelmoes(String naam, double prijsPerKg, String kleur) {
        super(naam, prijsPerKg);
        this.kleur = kleur;
    }

    public String toString() {
        return super.toString() + " " + kleur;
    }
}
