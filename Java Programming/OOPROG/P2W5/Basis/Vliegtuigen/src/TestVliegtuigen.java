import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVliegtuigen {
    public static void main(String[] args) {
        final Vliegtuig v1 = new Vliegtuig(new VliegtuigType("A345", "Airbus A340-541"),
                "A6-EHD", "Etihad Airways");
        final Vliegtuig v2 = new Vliegtuig(new VliegtuigType("B739", "Boeing 737-9K2"),
                "PH-BXR", "KLM");
        final Vliegtuig v3 = new Vliegtuig(new VliegtuigType("B748", "Boeing 747-830"),
                "D-ABYQ", "Lufthansa");
        final Vliegtuig v4 = new Vliegtuig(new VliegtuigType("A333", "Airbus A330-323X"),
                "N820NW", "Delta Air Lines");
        final Vliegtuig v5 = new Vliegtuig(new VliegtuigType("A333", "Airbus A330-343X"),
                "C-GFAJ", "Air Canada");

        List<Vliegtuig> vliegtuigen = new ArrayList<>();
        vliegtuigen.add(v1);
        vliegtuigen.add(v2);
        vliegtuigen.add(v3);
        vliegtuigen.add(v4);
        vliegtuigen.add(v5);

        for (Vliegtuig vliegtuig : vliegtuigen) {
            System.out.println(vliegtuig);
        }
        System.out.println();
        Iterator<Vliegtuig> iterator = vliegtuigen.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getMaatschappij().equals("KLM")) {
                iterator.remove();
            }
        }

        for (Vliegtuig vliegtuig : vliegtuigen) {
            System.out.println(vliegtuig);
        }
    }


}
