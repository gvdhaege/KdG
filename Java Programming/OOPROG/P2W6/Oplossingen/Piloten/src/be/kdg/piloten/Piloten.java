package be.kdg.piloten;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/11/13
 */
public class Piloten {
   // private Map<String, Piloot> piloten = new TreeMap<>();

    // Uitbreiding
    private Map<String, Piloot> piloten = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            String n1 = s1.split(" ")[1];
            String n2 = s2.split(" ")[1];
            return n1.compareTo(n2);
        }
    });

    public Piloten() {
        vulMap();
    }

    private void vulMap() {
        Piloot[] kampioenen = {
                new Piloot("Duits", "Michael Schumacher", 7),
                new Piloot("Argentijns", "Juan-Manuel Fangio", 5),
                new Piloot("Frans", "Alain Prost", 4),
                new Piloot("Duits", "Sebastian Vettel", 4),
                new Piloot("Australisch", "Jack Brabham", 3),
                new Piloot("Brits", "Jackie Stewart", 3),
                new Piloot("Oostenrijks", "Niki Lauda", 3),
                new Piloot("Braziliaans", "Nelson Piquet", 3),
                new Piloot("Braziliaans", "Ayrton Senna", 3)
        };

        int[][] seizoenen = {
                {1994, 1995, 2000, 2001, 2002, 2003, 2004},
                {1951, 1954, 1955, 1956, 1957},
                {1985, 1986, 1989, 1993},
                {2010, 2011, 2012, 2013},
                {1959, 1960, 1966},
                {1969, 1971, 1973},
                {1975, 1977, 1984},
                {1981, 1983, 1987},
                {1988, 1990, 1991}
        };

        for (int i = 0; i < kampioenen.length; i++) {
            kampioenen[i].voegSeizoenenToe(seizoenen[i]);
            piloten.put(kampioenen[i].getNaam(), kampioenen[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Piloot piloot : piloten.values()) {
            builder.append(piloot).append("\n");
        }
        return builder.toString();
    }
}
