package be.kdg.topdrie_anoniem;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class Resultaat {
    private String[] data;

    public Resultaat(String[] data) {
        this.data = data;
    }

    public Object topDrie(final String kop) {
        return new Object() {
            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder(kop);
                builder.append(": \n");
                for (int i = 0; i < 3; i++) {
                    builder.append(i + 1).append(".").append(data[i]).append("\n");
                }
                return builder.toString();
            }
        };
    }

    /*
    public static void main(String[] args) {
        String[] data = {
                "S.Vettel", "F.Alonso", "K.Räikkönen", "L.Hamilton",
                "M.Webber", "N.Rosberg", "R.Grosjean", "F.Massa"
        };

        Resultaat resultaat = new Resultaat(data);
        System.out.println(resultaat.topDrie("F1 2013"));
    }
    */

}
