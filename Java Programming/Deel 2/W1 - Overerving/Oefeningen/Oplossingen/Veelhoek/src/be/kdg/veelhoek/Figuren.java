package be.kdg.veelhoek;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kristiaan Behiels
 * @version 1.1 21-okt-2013
 */

/*
De klasse Figuren bevat als attributen een array van Veelhoek-objecten met de naam lijst en een int met de naam aantal.
Maak de array lijst in de constructor, voorzie 10 elementen.
Voorzie een methode voegFiguurToe om een veelhoek aan lijst toe te voegen.
Voorzie een methode getAantal die de actuele grootte van lijst teruggeeft.
Voorzie een methode neemFiguurWeg(int i) waarmee je het element op plaats i uit lijst kunt verwijderen.
Voorzie een toString-methode om de volledige inhoud van lijst als een string terug te geven.
 */
public class Figuren {
    private Veelhoek[] lijst;
    private int aantal;

    public Figuren() {
        lijst = new Veelhoek[10];
    }

    public void voegFiguurToe(Veelhoek veelhoek) {
       lijst[aantal++] = veelhoek;
    }

    public int getAantal() {
       return aantal;
    }

    public Veelhoek neemFiguurWeg(int index) {
        Veelhoek veelhoek = lijst[index];
        System.arraycopy(lijst, 1, lijst, 0, aantal);
        aantal--;
        return veelhoek;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < aantal; i++) {
           string += lijst[i].toString() + "\n";
        }
        return string;
    }
}