package HashMap.Demo1;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by venj on 7/12/2014.
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> motherAndKids = new HashMap<>();
        System.out.println("Is Empty: " + motherAndKids.isEmpty());
        motherAndKids.put("Sabine Appelmans", "Obi");
        motherAndKids.put("Tia Hellebaut", "Lotte");
        motherAndKids.put("Kim Clijsters", "Jada");
        motherAndKids.put("Kim Clijsters", "Jack");

        System.out.println("Is Empty: " + motherAndKids.isEmpty());
        System.out.println("Size: " + motherAndKids.size());
        System.out.println("Kim Clijsters present? " + motherAndKids.containsKey("Kim Clijsters"));
        System.out.println("Value of Kim Clijsters: " + motherAndKids.get("Kim Clijsters"));
        Set<String> allMothers = motherAndKids.keySet();
        System.out.print("All Mothers: ");
        for (String mother : allMothers) {
            System.out.printf("%s ", mother);
        }
        System.out.print("\nAll Kids: ");
        for (String kid : motherAndKids.values()) {
            System.out.printf("%s ", kid);
        }
    }
}

/*
Is Empty: true
Is Empty: false
Size: 3
Kim Clijsters present? true
Value of Kim Clijsters: Jack
All Mothers: Sabine Appelmans Tia Hellebaut Kim Clijsters
All Kids: Obi Lotte Jack
*/