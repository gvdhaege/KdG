package be.kdg.personen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 28/11/2014 21:47
 */
public class RunPersonen {
    public static void main(String[] args) {
        Personen personen = new Personen();

        personen.voegToe(new Persoon(1000, "Jos", 50));
        personen.voegToe(new Persoon(1010, "Erika", 25));
        personen.voegToe(new Persoon(1005, "Peter", 40));
        personen.voegToe(new Persoon(1000, "Joske", 5));
        personen.voegToe(new Persoon(1003, "Joke", 15));
        personen.voegToe(new Persoon(1004, "Dirk", 45));
        personen.voegToe(new Persoon(1007, "Dorien", 30));


        toonAllePersonen(personen);

        // Toon alle values (al dan niet bestaande) vanaf de id-waarde 1000 tot de maximale id-waarde
        for (Persoon persoon : personen.getAll()) {
            System.out.println(persoon);
        }
        System.out.println();

        // Vervang de persoon met id 1003 door een Persoon object met Karolien als naam en 27 als leeftijd
        personen.vervang(1003, new Persoon(1003, "Karolien", 27));

        // Vervang de persoon met het id 1010 als de value een Persoon object met id 1010, naam Petra en leeftijd 25 is
        // door als nieuwe value een Persoon object met de naam Karel en de leeftijd 70
        personen.vervangAls(1010, new Persoon(1010, "Petra", 25), new Persoon(1010, "Karel", 70));

        toonAllePersonen(personen);
    }

    private static void toonAllePersonen(Personen personen) {
        for (Persoon persoon : personen.getValues()) {
            System.out.println(persoon);
        }
        System.out.println();
    }
}

/*
1000 Jos        50
1003 Joke       15
1004 Dirk       45
1005 Peter      40
1007 Dorien     30
1010 Erika      25

1000 Jos        50
1001 Onbekend    0
1002 Onbekend    0
1003 Joke       15
1004 Dirk       45
1005 Peter      40
1006 Onbekend    0
1007 Dorien     30
1008 Onbekend    0
1009 Onbekend    0
1010 Erika      25

1000 Jos        50
1003 Karolien   27
1004 Dirk       45
1005 Peter      40
1007 Dorien     30
1010 Erika      25
*/