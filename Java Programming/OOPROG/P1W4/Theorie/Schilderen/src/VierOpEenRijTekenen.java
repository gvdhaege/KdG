import java.awt.*;
import java.util.Random;

/**
 * User: vochtenh
 * Date: 11-10-13 15:06
 */
public class VierOpEenRijTekenen {
    public static void main(String[] args) {
        Schilderij schilderij = new Schilderij(1000, 1000);
        Random random = new Random();
        schilderij.setKleur(Color.BLACK);

        for (int i = 0; i <= 1000; i += 100) {
            Lijn lijn = new Lijn(i, 1000, i, -1000);
            lijn.setKleur(Color.WHITE);
            schilderij.tekenLijn(lijn);
        }
        for (int i = 0; i <= 1000; i += 100) {
            Lijn lijn = new Lijn(1000, i, -1000, i);
            lijn.setKleur(Color.WHITE);
            schilderij.tekenLijn(lijn);
        }
        tekenSpeelSchijven(schilderij, random);
    }

    private static void tekenSpeelSchijven(Schilderij schilderij, Random random) {
        for (int i = 50; i <= 1000; i += 100) {
            for (int j = 50; j <= 1000; j += 100) {
                Schijf schijf = new Schijf(i, j, 40);
                boolean witteSchijf = random.nextBoolean();
                if (witteSchijf) {
                    schijf.setKleur(Color.WHITE);
                } else {
                    schijf.setKleur(Color.RED);
                }
                schilderij.tekenSchijf(schijf);
            }
        }
    }
}
