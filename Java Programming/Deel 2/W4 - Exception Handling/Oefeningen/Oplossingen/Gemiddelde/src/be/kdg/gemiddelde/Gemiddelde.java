package be.kdg.gemiddelde;

import java.util.List;

/*
 De klasse Gemiddelde heeft geen attributen.
 Voorzie een methode getGemiddelde die als parameter een type List<Double> heeft.
 Wanneer een RuntimeException optreedt pas je chaining toe (doe in het catch gedeelte een nieuwe throw).
 Voorzie een private methode som waarin de som van alle doubles in de lijst wordt gemaakt.
 Voorzie een private methode deel die een RuntimeException werpt als de deler nul is.
 Beide laatste methoden dien je in de getGemiddelde-methode te gebruiken! 
 */
public class Gemiddelde {

    public double getGemiddelde(double[] lijst) {
        try {
            return deel(som(lijst), lijst.length);
        }
        catch (RuntimeException ex) {
            throw new RuntimeException("De lijst is leeg", ex);  // chaining
        }
    }

    private double som(double[] lijst) {
        double som = 0.0;
        for (double getal : lijst) {
            som += getal;
        }
        return som;
    }

    private double deel(double deeltal, double deler) {
        if (deler == 0) {
            throw new RuntimeException("Deling door nul");
        }
        return deeltal / deler;
    }
}
