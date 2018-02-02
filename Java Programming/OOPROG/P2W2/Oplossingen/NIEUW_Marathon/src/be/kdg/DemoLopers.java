package be.kdg;

import be.kdg.datetime.Loper;
import be.kdg.datetime.Lopers;

import java.time.LocalTime;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 */
public class DemoLopers {
    private static Loper[] data = {
        new Loper("Filip Bosmans", 1001),
        new Loper("Jacques Vervecken", 1002),
        new Loper("Bart Moerenhout", 1003),
        new Loper("Valeer Van Deun", 1004),
        new Loper("Alexander De Kooman", 1005),
        new Loper("Fons Baeckelmans", 1006),
        new Loper("Geert Vastmans", 1007),
        new Loper("Rik Coecke", 1008),
        new Loper("Stan Deceuckeleire", 1009),
        new Loper("Peter Devriendt", 1010)
    };

    private static LocalTime[] tijden = {
        LocalTime.of(2, 18, 42),
        LocalTime.of(2, 13, 1),
        LocalTime.of(2, 21, 16),
        LocalTime.of(2, 8, 37),
        LocalTime.of(2, 16, 21),
        LocalTime.of(2, 16, 24),
        LocalTime.of(2, 12, 59),
        LocalTime.of(2, 14, 2),
        LocalTime.of(2, 14, 48),
        LocalTime.of(2, 13, 12)
    };

    public static void main(String[] args) {
        // Maak een nieuwe lijst met lopers
        Lopers lopers = new Lopers(data.length);

        // Voeg de lopers aan de lijst toe
        for (Loper loper : data) {
            lopers.voegLoperToe(loper);
        }

        int aantal = Lopers.getAantalLopers();
        Loper[] lopersTabel = lopers.getLopers();

         // Toon lopers (controle)
        // for (int i = 0; i < aantal; i++) {
        //    System.out.println(lopersTabel[i]);
        // }

        // Voeg tijden toe
        for (int i = 0; i < aantal; i++) {
            lopersTabel[i].setTijd(tijden[i]);
        }

        // Maak klassement
        lopers.sorteerVolgensTijd();

        // Toon lopers volgens klassement
        for (int i = 0; i < aantal; i++) {
            System.out.println(lopersTabel[i]);
        }
    }
}

/*
Valeer Van Deun       1004 02:08:37
Geert Vastmans        1007 02:12:59
Jacques Vervecken     1002 02:13:01
Peter Devriendt       1010 02:13:12
Rik Coecke            1008 02:14:02
Stan Deceuckeleire    1009 02:14:48
Alexander De Kooman   1005 02:16:21
Fons Baeckelmans      1006 02:16:24
Filip Bosmans         1001 02:18:42
Bart Moerenhout       1003 02:21:16
 */