package be.kdg.verjaardagen;

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
                new Persoon(LocalDate.of(0, 8, 23), "Zohra")
        };

        // Maak map
        Map<LocalDate, String> map = new HashMap<>(); // Met TreeMap automatisch gesorteerd op datum

        // Vul map
        for (Persoon persoon : personen) {
            map.put(persoon.getVerjaardag(), persoon.getNaam()); // Value "Sven" wordt overschreven door "Zohra"
        }

        // Toon keys
        for (LocalDate date : map.keySet()) {  // Set<Localdate>
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
            System.out.println(date.format(formatter));
        }
        System.out.println();

        // Toon values
        for (String naam : map.values()) {  // Collection<String>
            System.out.println(naam);
        }
        System.out.println();

        // Toon entries
        for (Map.Entry<LocalDate, String> entry : map.entrySet()) {  // Collection<Map.Entry<LocalDate, String>>
            System.out.println(new Persoon(entry.getKey(), entry.getValue())); // gebruik toString van Persoon
        }
    }
}

/*
18 september
23 augustus
08 november
25 december
15 maart

Jessica
Zohra
Annelien
Jessica
Jos

Jessica    18 september
Zohra      23 augustus
Annelien   08 november
Jessica    25 december
Jos        15 maart
*/