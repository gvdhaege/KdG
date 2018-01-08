package be.kdg.verjaardagen2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 12/12/2014 21:58
 */
public class TestVerjaardagen {
    public static void main(String[] args) {
        // Maak lijst van Persoon objecten
        Persoon[] personen = {
                new Persoon(LocalDate.of(0, 3, 15), "Jos"),
                new Persoon(LocalDate.of(0, 11, 8), "Annelien"),
                new Persoon(LocalDate.of(0, 8, 23), "Sven"),
                new Persoon(LocalDate.of(0, 9, 18), "Jessica"),
                new Persoon(LocalDate.of(0, 12, 25), "Jessica"),
                new Persoon(LocalDate.of(0, 8, 23), "Zohra"),
                new Persoon(LocalDate.of(0, 9, 18), "Deborah"),
                new Persoon(LocalDate.of(0, 9, 18), "Melissa"),
                new Persoon(LocalDate.of(0, 11, 8), "Annelies"),
                new Persoon(LocalDate.of(0, 4, 17), "Karolien"),
        };

        // Maak map
        Map<LocalDate, List<String>> map = new TreeMap<>(); // Met TreeMap automatisch gesorteerd op datum

        // Vul map
        for (Persoon persoon : personen) {
            LocalDate key = persoon.getVerjaardag();
            String naam = persoon.getNaam();
            List<String> namen;

            if (map.containsKey(key)) {
                namen = map.get(key);
            } else {
                namen = new ArrayList<>();
            }
            namen.add(naam);
            map.put(key, namen);
        }

        // Toon keys
        for (LocalDate date : map.keySet()) {  // Set<Localdate>
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
            System.out.println(date.format(formatter));
        }
        System.out.println();

        // Toon values
        for (List<String> namen : map.values()) {  // Collection<List<String>>
            for (String naam : namen) {
                System.out.print(naam + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Toon entries
        for (Map.Entry<LocalDate, List<String>> entry : map.entrySet()) {  // Collection<Map.Entry<LocalDate, List<String>>>
            LocalDate date = entry.getKey();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
            System.out.printf("%-12s --> ", date.format(formatter));

            List<String> namen = entry.getValue();
            System.out.println(String.join(", ", namen));
        }
    }
}

/*
15 maart
17 april
23 augustus
18 september
08 november
25 december

Jos
Karolien
Sven Zohra
Jessica Deborah Melissa
Annelien Annelies
Jessica

15 maart     --> Jos
17 april     --> Karolien
23 augustus  --> Sven, Zohra
18 september --> Jessica, Deborah, Melissa
08 november  --> Annelien, Annelies
25 december  --> Jessica
*/