package be.kdg.scores;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class RunStudenten {
    public static void main(String[] args) {
        Studenten studenten = new Studenten();

        System.out.println("Overzicht resultaten:");
        System.out.println(studenten.getScores());
    }
}

/*
Overzicht resultaten:
Marjolein    -> 18
Marijke      -> 15
Marie Laure  -> 14
Marieke      -> 13
*/