import java.time.LocalTime;

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
        Lopers lopers = new Lopers(data.length);
        for (Loper loper : data) {
            lopers.voegLoperToe(loper);
        }
        int aantal = Lopers.aantalLopers();
        Loper[] lopersTabel = lopers.getLopers();

        for (int i = 0; i < aantal; i++) {
            lopersTabel[i].setTijd(tijden[i]);
        }
        lopers.sorteerVolgensTijd();
        for (int i = 0; i < aantal; i++) {
            System.out.println(lopersTabel[i]);
        }

    }
}

