import java.util.*;

public class RunVerjaardag {
    public static void main(String[] args) {
        Persoon[] data = {
                new Persoon("Jos", new Datum(16, Datum.Maand.MEI)),
                new Persoon("Bas", 9, Datum.Maand.DECEMBER),
                new Persoon("Evy", 15, Datum.Maand.AUGUSTUS),
                new Persoon("Jos", 23, Datum.Maand.AUGUSTUS),
                new Persoon("Els", new Datum(25, Datum.Maand.APRIL)),
                new Persoon("Ann", 15, Datum.Maand.AUGUSTUS),
                new Persoon("Jos", 3, Datum.Maand.AUGUSTUS),
                new Persoon("Els", 10, Datum.Maand.APRIL)
        };
        List<Persoon> personen = new ArrayList<>(Arrays.asList(data));


        toonPersonen(personen);

        Collections.sort(personen);
        System.out.println("\nGesorteerd op verjaardag:");
        toonPersonen(personen);

        Collections.sort(personen, new Comparator<Persoon>() {
            @Override
            public int compare(Persoon persoon, Persoon anderePersoon) {
                int verschil = persoon.getNaam().compareTo(anderePersoon.getNaam());
                if (verschil != 0) {
                    return verschil;
                }
                return persoon.getVerjaardag().compareTo(anderePersoon.getVerjaardag());
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
