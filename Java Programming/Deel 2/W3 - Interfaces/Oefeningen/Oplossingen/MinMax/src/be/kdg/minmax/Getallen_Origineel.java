package be.kdg.minmax;

import be.kdg.minmax.MinMax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * De klasse Getallen bevat slechts één attribuut, een List van Integer objecten.
 * Ze implementeert de MinMax-interface.
 */
public class Getallen_Origineel implements MinMax {
    private List<Integer> getallen = new ArrayList<>();

    /**
     * Methode om, vertrekkende van een int-waarde,
     * een overeenstemmend Integer object aan de ArrayList toe te voegen.
     *
     * @param getal Het toe te voegen getal.
     */
    public void add(int getal) {
        getallen.add(getal);
    }

    /**
     * Methode die de kleinste int-waarde in de ArrayList in de vorm van
     * een String teruggeeft.
     *
     * @return String De kleinste int-waarde.
     */
    public String minimum() {
        int min = Collections.min(getallen);
        return Integer.toString(min);
    }

    /**
     * Methode die de grootste int-waarde in de ArrayList in de vorm van
     * een String teruggeeft.
     *
     * @return String De grootste int-waarde.
     */
    public String maximum() {
        int max = Collections.max(getallen);
        return Integer.toString(max);
    }

    /**
     * Methode die de inhoud van de Arraylist (de getalwaarden) op één regel
     * gescheiden door een spatie afdrukt.
     */
    public void toon() {
        for (Integer getal : getallen) {
            System.out.print(getal + " ");
        }
        System.out.println("");
    }
}
