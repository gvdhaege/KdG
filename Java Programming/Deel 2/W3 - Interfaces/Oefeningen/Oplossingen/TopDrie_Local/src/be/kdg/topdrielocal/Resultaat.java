package be.kdg.topdrielocal;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class Resultaat {
    private String[] data;

    public Resultaat(String[] data) {
        this.data = data;
    }

    public String topDrie(String kop) {
        class Tierce {
            private String kop;

            Tierce(String kop) {
                this.kop = kop;
            }

            private String getTop() {
                StringBuilder builder = new StringBuilder(kop);
                builder.append(": \n");
                for (int i = 0; i < 3; i++) {
                    builder.append(i + 1).append(".").append(data[i]).append("\n");
                }
                return builder.toString();
            }
        }

        Tierce tierce = new Tierce(kop);
        return tierce.getTop();

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
