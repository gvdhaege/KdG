package Drank;

public class Drank implements Comparable<Drank> {
    private String naam;
    private double prijs;
    private boolean isAlcoholisch;

    public Drank(String naam, double prijs, boolean isAlcoholisch) {
        this.naam = naam;
        this.prijs = prijs;
        this.isAlcoholisch = isAlcoholisch;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public boolean isAlcoholisch() {
        return isAlcoholisch;
    }

    @Override
    public int compareTo(Drank o) {
        return Double.compare(this.prijs, o.prijs);
    }

    @Override
    public String toString() {
        return String.format("%s €%s", naam, prijs);
    }
}
