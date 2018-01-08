package be.kdg.scores3;

import java.util.Set;
import java.util.SortedSet;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class RunStudenten {
    public static void main(String[] args) {
        Studenten studenten = new Studenten();

        System.out.println("Overzicht resultaten:");
        System.out.println(studenten);

        SortedSet<Student> set = studenten.getStudenten();
        System.out.println("Hoogste score: " + set.first());
        System.out.println("Laagste score: " + set.last());

    }
}

/*
Marjolein    -> 18
Marijke      -> 15
Marie Laure  -> 14
Marieke      -> 13
*/