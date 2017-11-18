package be.kdg;

import be.kdg.seizoenen.*;

import java.util.Random;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21/10/13
 */
public class TestSeizoenen {
    public static void main(String[] args) {
        Seizoen[] seizoenen = {
            new Lente(), new Zomer(), new Herfst(), new Winter()
        };

        for (Seizoen seizoen : seizoenen) {
            System.out.println(seizoen.getBegin());

        }
        System.out.println();

        System.out.println("Random:");
        Random random = new Random();
        for (Seizoen seizoen : seizoenen) {
            int index = random.nextInt(4);
            System.out.println(seizoenen[index].getBegin());
        }
    }
}

/*
In 2014 begint de lente op 20 maart
In 2014 begint de zomer op 21 juni
In 2014 begint de herfst op 23 september
In 2014 begint de winter op 21 december

Random:
In 2014 begint de lente op 20 maart
In 2014 begint de herfst op 23 september
In 2014 begint de herfst op 23 september
In 2014 begint de winter op 21 december
*/