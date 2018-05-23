package be.kdg.junitdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * In deze klasse vind je een aantal logische fouten terug. Verbeter ze aan de hand van de
 * bijgevoegde testen. Zorg ervoor dat je een groene balk krijgt!
 */
public class Gemiddelden {
    private List<Double> getallen;

    public Gemiddelden() {
        this.getallen = new ArrayList<Double>();
    }

    public void voegGetalToe(double getal) {
        getallen.add(getal);
    }

    public void maakLeeg() {
        this.getallen = new ArrayList<Double>();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);    //To change body of overridden methods use File | Settings | File Templates.
    }

    // Klassieke berekening van het gemiddelde
    public double rekenkundigGemiddelde() {
        double som = 0;
        for(Double getal : getallen) {
            som += getal;
        }
        if(getallen.size() == 0) {
            throw new ArithmeticException("Kan niet delen door 0");
        }
        return som / getallen.size();
    }

    // Zie onder ander http://nl.wikipedia.org/wiki/Meetkundig_gemiddelde
    // en uiteraard Javadoc voor de pow-methode.
    public double meetkundigGemiddelde() {
        double product = 1;
        for(Double getal : getallen) {
            product *= getal;
        }
        if(getallen.size() == 0) {
            throw new ArithmeticException("Kan niet delen door 0");
        }
        return Math.pow(product, 1.0 / getallen.size());
    }
}
