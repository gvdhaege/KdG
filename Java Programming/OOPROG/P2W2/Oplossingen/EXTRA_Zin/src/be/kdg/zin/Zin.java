package be.kdg.zin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
De klasse Zin bevat slechts één attribuut, met name tokens (type String[]).
Voorzie een constructor waarmee uitgaande van een string de tabel tokens gevuld wordt.
Beschouw een spatie als scheiding tussen twee woorden.
Voorzie een methode aantalWoorden die het aantal woorden teruggeeft.
Voorzie een methode keerOm die de woorden in de zin omkeert.
Voorzie een toString methode om de tokens (woorden) gescheiden door een spatie op één regel te tonen.
 */
public class Zin {
    private String[] tokens;

    public Zin(String string) {
        tokens = string.split(" ");
    }

    public int aantalWoorden() {
        return tokens.length;
    }

    public void keerOm() {
        List<String> lijst = Arrays.asList(tokens);
        Collections.reverse(lijst);
        tokens = (String[]) lijst.toArray();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String token : tokens) {
            builder.append(token).append(' ');
        }
        return builder.toString();
    }
}
