package HashSet.Opdracht1;

import java.util.HashSet;

/**
 * @author Kristiaan Behiels
 * @version 1.0 12/12/2014 20:42
 */
public class SetOpdrachtTwee {
    public static void main(String[] args) {
        HashSet<VrouwenNaam> namenSet = new HashSet<>();
        String[] girls = {"An", "Bea", "Bea", "Diana", "Zoë", "Katleen", "Kristin", "Bea", "Kristin", "Gertrude"};

        for (String girl : girls) {
            VrouwenNaam naam = new VrouwenNaam(girl);
            namenSet.add(naam);
        }

        for (VrouwenNaam vrouw : namenSet) {
            System.out.print(vrouw + " ");
        }
    }
}

/*
Diana Kristin Zoë An Gertrude Katleen Bea
*/
