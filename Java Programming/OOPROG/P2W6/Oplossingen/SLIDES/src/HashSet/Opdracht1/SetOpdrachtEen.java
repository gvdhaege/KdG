package HashSet.Opdracht1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Kristiaan Behiels
 * @version 1.0 12/12/2014 20:35
 */
public class SetOpdrachtEen {
    public static void main(String[] args) {
        String[] girls = {"An", "Bea", "Bea", "Diana", "Zoë", "Katleen", "Kristin", "Bea", "Kristin", "Gertrude"};

        HashSet<String> namenSet = new HashSet<>(Arrays.asList(girls));

        for (String naam : namenSet) {
            System.out.print(naam + " ");
        }
    }
}

/*
Diana Kristin Zoë An Gertrude Katleen Bea
*/