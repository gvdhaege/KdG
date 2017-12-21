package be.kdg.planeten;

/*
De klasse Planeet bevat drie attributen, met name de String naam, de int diameter en de double relatieveMassa.
De constructor (met drie parameters) zorgt ervoor dat alle attributen hun waarden bekomen.
Voorzie getters voor alle attributen.
Voorzie een toString-methode die de inhpud van de drie attributen in één string teruggeeft (zie uitvoer).
De klasse moet een implements doen van Comparable<Planeet> en als gevolg daarvan moet er een comparetTo methode voorzien worden.
 */
public class Planeet implements Comparable<Planeet> {
    private String naam;
    private int diameter;
    private double relatieveMassa;

    public Planeet(String naam, int diameter, double relatieveMassa) {
        this.naam = naam;
        this.diameter = diameter;
        this.relatieveMassa = relatieveMassa;
    }

    public String getNaam() {
        return naam;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getRelatieveMassa() {
        return relatieveMassa;
    }

    @Override
    public String toString() {
        return String.format("%-10s %7d %5.1f", naam, diameter, relatieveMassa);
    }

    public int compareTo(Planeet anderePlaneet) {
        return diameter - anderePlaneet.diameter;
    }

}
