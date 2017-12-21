package be.kdg.fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Deze klasse moet je verder uitwerken.
 */
public class FruitLijst {
    private Fruit[] fruitlijst = new Fruit[7]; // zie aantal in main
    private int aantal;


    /**
     * Methode om een Fruit-object aan de lijst toe te voeren.
     * @param fruit Het fruit
     */
    public void add(Fruit fruit) {
        fruitlijst[aantal++] = fruit;
    }
  
    /**
     * De methode sorteerVolgensPrijs maakt gebruik van de methode
     * sort van de klasse Arrays om de lijst volgens oplopende
     * prijs te sorteren. De lijst dient volledig gevuld te zijn!
     */
    public void sorteerVolgensPrijs() {
        Arrays.sort(fruitlijst);
    }

    /**
     * De methode toon drukt de inhoud van de fruitlijst af
     * door gebruik te maken van een iterator.
     */
    public void toon() {
        for (Fruit fruit : fruitlijst) {
            System.out.println(fruit);
        }
    }
}
