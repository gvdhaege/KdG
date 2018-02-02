package be.kdg;

import be.kdg.palindroom.Palindroom;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
Gebruik deze klasse om beide methoden te testen.
 */
public class TestPalindroom {
    static final String[] palindromen = {
            "lepel", "Radar", "parterretrap", "koortsmeetsysteemstrook",
            "a man, a plan, a canal: Panama", "\"De mooie zeeman nam Anna mee\", zei oom Ed",
            "koekoek", "Dit is geen palindroom"
    };


    public static void main(String[] args) {
        for (String palindroom : palindromen) {
            System.out.printf("%b %b\n", Palindroom.isPalindroom(palindroom), Palindroom.isZinPalindroom(palindroom));
        }
    }
}

/*
true true
true true
true true
true true
false true
false true
false false
false false
*/