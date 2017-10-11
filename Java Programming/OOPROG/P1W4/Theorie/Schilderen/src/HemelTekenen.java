import java.awt.*;
import java.util.Random;

public class HemelTekenen {
    public static void main(String[] args) {
        Schilderij schilderij = new Schilderij(1000, 750);
        Schijf zon = new Schijf(120, 150, 75);
        Random random = new Random();
        Random random2 = new Random();

        schilderij.setKleur(Color.BLUE);
        schilderij.tekenSchijf(zon);

        zon.setKleur(Color.YELLOW);

        wolkenTekenen(schilderij, random, random2);
    }

    private static void wolkenTekenen(Schilderij schilderij, Random random, Random random2) {
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(1000);
            int y = random2.nextInt(750);
            Schijf wolk = new Schijf(x, y, 60);
            wolk.setKleur(Color.WHITE);
            schilderij.tekenSchijf(wolk);
        }
    }
}
