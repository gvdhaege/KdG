package be.kdg.topdrie_anoniem;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class RunResultaat {
    public static void main(String[] args) {
        String[] data = {
                "S.Vettel", "F.Alonso", "K.Räikkönen", "L.Hamilton",
                "M.Webber", "N.Rosberg", "R.Grosjean", "F.Massa"
        };

        Resultaat resultaat = new Resultaat(data);
        System.out.println(resultaat.topDrie("F1 2013"));
    }
}

/*
F1 2013:
1.S.Vettel
2.F.Alonso
3.K.Räikkönen
*/
