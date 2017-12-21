package be.kdg.fruit;

/**
 * De klasse Fruit is een abstracte klasse die tevens de
 * Comparable interface implementeert. Deze interface is een
 * bestaande interface in Java, je hoeft hem dus zelf niet te
 * schrijven.
 *
 * De klasse Fruit bevat een String-attribuut (naam) en een
 * double-attribuut (prijsPerKg). Naast een constructor die
 * beide attributen invult zal je ook nog een toString-methode
 * moeten voorzien.
 */
public abstract class Fruit implements Comparable<Fruit> {
    private String naam;
    private double prijsPerKg;

    protected Fruit(String naam, double prijsPerKg) {
        this.naam = naam;
        this.prijsPerKg = prijsPerKg;
    }

    public String toString() {
        return String.format("%-20s €%4.2f", naam, prijsPerKg);
    }

    public int compareTo(Fruit fruit) {
        if (this.prijsPerKg == fruit.prijsPerKg) {
            return 0;
        } else if (this.prijsPerKg > fruit.prijsPerKg) {
            return 1;
        }
        return -1;
    }
}
