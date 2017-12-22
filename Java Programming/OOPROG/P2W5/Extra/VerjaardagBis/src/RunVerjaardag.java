import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class RunVerjaardag {
    public static void main(String[] args) {
        Persoon[] data = {
                new Persoon("Jos", LocalDate.of(0, Month.MAY, 16)),
                new Persoon("Bas", LocalDate.of(0, Month.DECEMBER, 9)),
                new Persoon("Evy", LocalDate.of(0, Month.AUGUST, 15)),
                new Persoon("Jos", LocalDate.of(0, Month.AUGUST, 23)),
                new Persoon("Els", LocalDate.of(0, Month.APRIL, 25)),
                new Persoon("Ann", LocalDate.of(0, Month.AUGUST, 15)),
                new Persoon("Jos", LocalDate.of(0, Month.AUGUST, 3)),
                new Persoon("Els", LocalDate.of(0, Month.APRIL, 10))};

        List<Persoon> personen = new ArrayList<>(asList(data));
        System.out.println("Originele lijst:");
        toonPersonen(personen);

        Collections.sort(personen);
        System.out.println("\nGesorteerd op verjaardag:");
        toonPersonen(personen);

        Collections.sort(personen, new Comparator<Persoon>() {
            @Override
            public int compare(Persoon o1, Persoon o2) {
                return o1.getNaam().compareTo(o2.getNaam());
            }
        });

        System.out.println("\nGesorteerd op naam:");
        toonPersonen(personen);
    }

    private static void toonPersonen(List<Persoon> personen) {
        for (Persoon persoon : personen) {
            System.out.println(persoon);
        }
    }
}