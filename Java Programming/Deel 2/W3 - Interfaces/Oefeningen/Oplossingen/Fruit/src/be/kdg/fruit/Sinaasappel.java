package be.kdg.fruit;

/**
 * De klasse Sinaasappel is een uitbreiding van de klasse Fruit.
 * Ze heeft een extra attribuut van het type boolean om aan te duiden
 * of het om eet- dan wel persappelsienen gaat (true bij de eetversie).
 */
public class Sinaasappel extends Fruit {
    private boolean soort;

    public Sinaasappel(String naam, double prijsPerKg, boolean soort) {
        super(naam, prijsPerKg);
        this.soort = soort;
    }

    public String toString() {
        return super.toString() + " " + (soort ? "eetappelsien" : "persappelsien");
    }

}
