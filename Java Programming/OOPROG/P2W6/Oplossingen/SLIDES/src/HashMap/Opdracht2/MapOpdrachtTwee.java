package HashMap.Opdracht2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by venj on 7/12/2014.
 */
public class MapOpdrachtTwee {
    public static void main(String[] args) {
        KindTwee k1 = new KindTwee("Jefke", 10, 151);
        KindTwee k2 = new KindTwee("Marie", 14, 179);
        KindTwee k3 = new KindTwee("Sofie", 4, 110);
        KindTwee k4 = new KindTwee("Melissa", 8, 151);
        KindTwee k5 = new KindTwee("Jefke", 11, 148);

        HashMap<KindTwee, String> kindMap = new HashMap<>();
        kindMap.put(k1, k1.getNaam());
        kindMap.put(k2, k2.getNaam());
        kindMap.put(k3, k3.getNaam());
        kindMap.put(k4, k4.getNaam());
        kindMap.put(k5, k5.getNaam());

        System.out.println("Aantal entries: " + kindMap.size());
        System.out.println("Kindjes: ");
        for (KindTwee kind : kindMap.keySet()) {
            System.out.print(kind + " /--/ ");
        }
        System.out.println("\nNamen: ");
        for (String naam : kindMap.values()) {
            System.out.print(naam + " /--/ ");
        }
        System.out.print("\nEntries: ");
        for (Map.Entry<KindTwee, String> element : kindMap.entrySet()) {
            System.out.printf("%n   %s (%s)", element.getKey().toString(), element.getValue());
        }
    }
}

/*
Aantal entries: 4
Kindjes:
Marie (14j) is 179cm /--/ Melissa (8j) is 151cm /--/ Sofie (4j) is 110cm /--/ Jefke (10j) is 151cm /--/
Namen:
Marie /--/ Melissa /--/ Sofie /--/ Jefke /--/
Entries:
   Marie (14j) is 179cm (Marie)
   Melissa (8j) is 151cm (Melissa)
   Sofie (4j) is 110cm (Sofie)
   Jefke (10j) is 151cm (Jefke)
*/