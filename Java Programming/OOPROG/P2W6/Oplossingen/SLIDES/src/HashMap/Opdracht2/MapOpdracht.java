package HashMap.Opdracht2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by venj on 7/12/2014.
 */
public class MapOpdracht {
    public static void main(String[] args) {
        Kind k1 = new Kind("Jefke", 10, 151);
        Kind k2 = new Kind("Marie", 14, 179);
        Kind k3 = new Kind("Sofie", 4, 110);
        Kind k4 = new Kind("Melissa", 8, 151);
        Kind k5 = new Kind("Jefke", 11, 148);

        HashMap<Kind, String> kindMap = new HashMap<>();
        kindMap.put(k1, k1.getNaam());
        kindMap.put(k2, k2.getNaam());
        kindMap.put(k3, k3.getNaam());
        kindMap.put(k4, k4.getNaam());
        kindMap.put(k5, k5.getNaam());

        System.out.println("Aantal entries: " + kindMap.size());
        System.out.println("Kindjes: ");
        for (Kind kind : kindMap.keySet()) {
            System.out.print(kind + " /--/ ");
        }
        System.out.println("\nNamen: ");
        for (String naam : kindMap.values()) {
            System.out.print(naam + " /--/ ");
        }
        System.out.print("\nEntries: ");
        for (Map.Entry<Kind, String> element : kindMap.entrySet()) {
            System.out.printf("%n   %s (%s)", element.getKey().toString(), element.getValue());
        }
    }
}

/*
Aantal entries: 5
Kindjes:
Marie (14j) is 179cm /--/ Jefke (11j) is 148cm /--/ Melissa (8j) is 151cm /--/ Jefke (10j) is 151cm /--/ Sofie (4j) is 110cm /--/
Namen:
Marie /--/ Jefke /--/ Melissa /--/ Jefke /--/ Sofie /--/
Entries:
   Marie (14j) is 179cm (Marie)
   Jefke (11j) is 148cm (Jefke)
   Melissa (8j) is 151cm (Melissa)
   Jefke (10j) is 151cm (Jefke)
   Sofie (4j) is 110cm (Sofie)
*/