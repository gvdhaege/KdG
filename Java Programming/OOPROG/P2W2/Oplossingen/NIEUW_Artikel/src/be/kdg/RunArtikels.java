package be.kdg;

import be.kdg.datetime.Artikel;
import be.kdg.datetime.Artikels;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 */
public class RunArtikels {
    private static final Artikel[] gegevens = {
        new Artikel("Kitkat", 13, LocalDate.of(2014, Month.NOVEMBER, 12)),
        new Artikel("Lollipop", 147, LocalDate.of(2014, 12, 12)),
        new Artikel("Jelly Bean", 23, LocalDate.of(2014, 11, 12)),
        new Artikel("Froyo", 56, LocalDate.of(2013, 11, 12)),
        new Artikel("Donut", 123, LocalDate.of(2014, 11, 13)),
        new Artikel("Cupcake", 77, LocalDate.of(2014, 11, 11))
    };

    public static void main(String[] args) {
        Artikels artikels = new Artikels(gegevens);

        // Toon alle artikels
        System.out.println("Alle artikels:");
        Artikel[] alleArtikels = artikels.getArtikels();
        for (Artikel artikel : alleArtikels) {
            System.out.println(artikel);
        }

        // Toon de artikels met productiedatum 12 november 2014
        System.out.println("\nArtikels met productiedatum 12 november 2014:");
        for (Artikel artikel : alleArtikels) {
            if (artikel.getProductieDatum().equals(LocalDate.of(2014, 11, 12))) {
                System.out.println(artikel);
            }
        }
    }
}

/*
Alle artikels:
Kitkat       0013 2014-11-12
Lollipop     0147 2014-12-12
Jelly Bean   0023 2014-11-12
Froyo        0056 2013-11-12
Donut        0123 2014-11-13
Cupcake      0077 2014-11-11

Artikels met productiedatum 12 november 2014:
Kitkat       0013 2014-11-12
Jelly Bean   0023 2014-11-12
 */