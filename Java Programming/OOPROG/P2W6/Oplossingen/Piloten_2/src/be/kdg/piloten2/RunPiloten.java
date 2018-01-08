package be.kdg.piloten2;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/11/13
 */
public class RunPiloten {
    public static void main(String[] args) {
        Piloten piloten = new Piloten();
        System.out.println(piloten); // Ter controle

        System.out.print("Kampioen met de meeste titels: ");
        Piloot kampioen = piloten.pilootMetDeMeesteTitels();
        System.out.println(kampioen.getNaam() + ": " + kampioen.getTitels());

        System.out.print("Brazilaanse kampioenen: ");
        for (Piloot piloot : piloten.pilotenMetNationaliteit("Braziliaans")) {
            System.out.print("\"" + piloot.getNaam() + "\" ");
        }
        System.out.println('\n');

        System.out.println("Kampioenen volgens nationaliteit:");
        for (Piloot piloot : piloten.gesorteerdVolgensNationaliteit()) {
            System.out.printf("%-12s -> %s%n", piloot.getNationaliteit(), piloot.getNaam());
        }
        System.out.println();

    }
}

/*
Frans           Alain Prost          4  [1985, 1986, 1989, 1993]
Braziliaans     Ayrton Senna         3  [1988, 1990, 1991]
Australisch     Jack Brabham         3  [1959, 1960, 1966]
Brits           Jackie Stewart       3  [1969, 1971, 1973]
Argentijns      Juan Manuel Fangio   5  [1951, 1954, 1955, 1956, 1957]
Duits           Michael Schumacher   7  [1994, 1995, 2000, 2001, 2002, 2003, 2004]
Braziliaans     Nelson Piquet        3  [1981, 1983, 1987]
Oostenrijks     Niki Lauda           3  [1975, 1977, 1984]
Duits           Sebastian Vettel     4  [2010, 2011, 2012, 2013]

Kampioen met de meeste titels: Michael Schumacher: 7
Brazilaanse kampioenen: "Ayrton Senna" "Nelson Piquet"

Kampioenen volgens nationaliteit:
Argentijns   -> Juan Manuel Fangio
Australisch  -> Jack Brabham
Braziliaans  -> Ayrton Senna
Braziliaans  -> Nelson Piquet
Brits        -> Jackie Stewart
Duits        -> Michael Schumacher
Duits        -> Sebastian Vettel
Frans        -> Alain Prost
Oostenrijks  -> Niki Lauda
*/


