package be.kdg.omzetting;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
De methode zetOmNaarGetal moet een string waarbij elke digit door zijn overeenkomstig cijfer in letters wordt weergegeven omzetten naar een long.
 */
public class LettersNaarGetal {
    private static String[] cijfers = {
       "nul", "een", "twee", "drie", "vier",
       "vijf", "zes", "zeven", "acht", "negen"
    };

    public static long zetOmNaarGetal(String string) {
        long getal = 0;
        string = string.trim().toLowerCase();
        String[] tokens = string.split(" ");

        for (String token : tokens) {
            for (int i = 0; i < cijfers.length; i++) {
                if (token.equals(cijfers[i])) {
                    getal = getal * 10 + i;
                }
            }
        }
        return getal;
    }
}
