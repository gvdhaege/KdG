package HashSet.Demo2;

import java.util.*;

/**
 * Created by venj on 7/12/2014.
 */
public class Demo2 {
    public static void main(String[] args) {
        String[] colors = {"rood", "wit", "blauw", "groen", "grijs",
                "oranje", "huidskleur", "wit", "perzik", "grijs", "oranje"};

        List<String> kleuren = new ArrayList<>(Arrays.asList(colors));
        System.out.println("Kleuren: " + kleuren);

        Set<String> set = new HashSet<>(kleuren);
        System.out.print("\nZonder dubbels: ");
        for (String kleur : set) {
            System.out.print(kleur + " ");
        }
        System.out.println();
    }
}

/*
Kleuren: [rood, wit, blauw, groen, grijs, oranje, huidskleur, wit, perzik, grijs, oranje]

Zonder dubbels: wit oranje rood grijs perzik groen huidskleur blauw
*/