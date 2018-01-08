package HashMap.Demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by venj on 7/12/2014.
 */
public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, String[]> motherAndKids = new HashMap<String, String[]>();
        motherAndKids.put("Sabine Appelmans", new String[]{"Obi", "Arno"});
        motherAndKids.put("Tia Hellebaut", new String[]{"Lotte", "Saartje", "Lars"});
        motherAndKids.put("Kim Clijsters", new String[]{"Jada", "Jack"});

        System.out.println(motherAndKids.size());
        String[] kidsOfKim = motherAndKids.get("Kim Clijsters");
        String text = "";
        for (String kid : kidsOfKim)
            text += (kid + " "); // TODO StringBuilder gebruiken!
        System.out.println("Value of Kim Clijsters: " + text);
        Set<String> allMothers = motherAndKids.keySet();
        System.out.print("All Mothers: ");
        for (String mother : allMothers) {
            System.out.printf("%s ", mother);
        }
        System.out.print("\nAll Kids: ");
        for (String[] kids : motherAndKids.values()) {
            for (String kid : kids)
                System.out.printf("%s ", kid);
        }
    }
}

/*
3
Value of Kim Clijsters: Jada Jack
All Mothers: Sabine Appelmans Tia Hellebaut Kim Clijsters
All Kids: Obi Arno Lotte Saartje Lars Jada Jack
*/