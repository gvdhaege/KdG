package be.kdg.piloten2;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/11/13
 */
public class Piloten {
    private Map<String, Piloot> piloten = new TreeMap<>();

    // Uitbreiding
    /*private Map<String, Piloot> piloten = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            String n1 = s1.split(" ")[1];
            String n2 = s2.split(" ")[1];
            return n1.compareTo(n2);
        }
    });*/

    public Piloten() {
        vulMap();
    }

    // Geeft de piloot met de meeste titels (uit de Map halen en for each gebruiken!)
    public Piloot pilootMetDeMeesteTitels() {
        int max = 0;
        Piloot kampioen = null;
        for (Piloot piloot : piloten.values()) {
            int aantal = piloot.getTitels();
            if (aantal > max) {
                max = aantal;
                kampioen = piloot;
            }
        }
        return kampioen;
    }

    // Geeft een List met de piloten met een gegeven nationaliteit
    public List<Piloot> pilotenMetNationaliteit(String land) {
        List<Piloot> kampioenen = new ArrayList<>();
        for (Piloot piloot : piloten.values()) {
            if (piloot.getNationaliteit().equals(land)) {
                kampioenen.add(piloot);
            }
        }
        return kampioenen;
    }

    // Geeft een List van alle piloten in volgorde nationaliteit,
    // Maakt gebruik van een comparator (anonymous inner class)
    public List<Piloot> gesorteerdVolgensNationaliteit() {
        List<Piloot> kampioenen = new ArrayList<>(piloten.values());
        Collections.sort(kampioenen, new Comparator<Piloot>() {
            @Override
            public int compare(Piloot p1, Piloot p2) {
                return p1.getNationaliteit().compareTo(p2.getNationaliteit());
            }
        });
        return kampioenen;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Piloot piloot : piloten.values()) {
            builder.append(piloot).append("\n");
        }
        return builder.toString();
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
}
