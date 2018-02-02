package be.kdg;

import be.kdg.persoon.Personen;
import be.kdg.persoon.Persoon;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
Vul deze klasse aan om je programma te testen.
 */
public class TestPersoon {
    private static final Persoon[] data = {
            new Persoon("Jan", "Van den Broecke"),
            new Persoon("Jozef", "Vandenbroeke"),
            new Persoon("Els", "Van Damme"),
            new Persoon("Emma", "Devocht"),
            new Persoon("Annick", "Devocht"),
            new Persoon("Annie", "De Vocht"),
            new Persoon("Frans", "D'Hooghe"),
            new Persoon("Fons", "De Wilde"),
            new Persoon("Magda", "De Haene"),
            new Persoon("Julie", "Vermeulen"),
            new Persoon("Charlotte", "Van Den Brande"),
            new Persoon("Jean-Pierre", "Daemen"),
            new Persoon("Bert", "Van Basten"),
            new Persoon("Stien", "D'Haene"),
            new Persoon("Sterre", "Vandenbrande"),
    };

    public static void main(String[] args) {
        Personen personen = new Personen(Arrays.asList(data));
        personen.sorteer();

        // Haal de lijst op uit personen en print elk Persoon object via de toString methode
        List<Persoon> lijst = personen.getPersonen();
        for (Persoon persoon : lijst) {
            System.out.println(persoon);
        }

    }
}

/*
Daemen Jean-Pierre
De Haene Magda
Devocht Annick
De Vocht Annie
Devocht Emma
De Wilde Fons
D'Haene Stien
D'Hooghe Frans
Van Basten Bert
Van Damme Els
Van Den Brande Charlotte
Vandenbrande Sterre
Van den Broecke Jan
Vandenbroeke Jozef
Vermeulen Julie
*/