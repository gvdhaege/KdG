package be.kdg;

import be.kdg.bord.Bord;
import be.kdg.bord.RondBord;
import be.kdg.bord.VierkantBord;

import java.util.Random;

/*
Vul deze klasse aan. Via random bewijzen we de werking van polyformisme (late binding).
Maak een tabel voor MAX_AANTAL (= 10) Bord objecten met de naam lijst.
Schrijf een for-lus waarin je de teller laat gaan van 0 tot MAX_AANTAL.
In deze lus moet je via een random int een willekeurig Bord-object uit de tabel borden kiezen en dit aan de lijst toevoegen.
Schrijf daarna een for-each-lus om alle objecten in de lijst via hun toString methode af te drukken.
Zie een voorbeeld van de mogelijke uitvoer onderaan.
 */
public class TestBord {
    private static final Random random = new Random();
    private static final int MAX_AANTAL = 10;

    public static void main(String[] args) {
        Bord[] borden = {
                new RondBord("karton", "groen", 30),
                new VierkantBord("porcelijn", "wit", 20),
                new RondBord("plastiek", "blauw", 35),
                new VierkantBord("inox", "zilver", 25),
        };

        // Aanvullen
        int teller = 0;
        Bord[] lijst = new Bord[MAX_AANTAL];
        for (int i = 0; i < MAX_AANTAL; i++) {
            int index = random.nextInt(borden.length);
            lijst[teller++] = borden[index];
        }

        for (Bord bord : lijst) {
            System.out.println(bord);
        }

    }
}

/*
Vierkant porcelijn wit    400cm²
Vierkant inox      zilver 625cm²
Vierkant inox      zilver 625cm²
Rond     karton    groen  707cm²
Rond     plastiek  blauw  962cm²
Rond     plastiek  blauw  962cm²
Vierkant inox      zilver 625cm²
Vierkant inox      zilver 625cm²
Rond     karton    groen  707cm²
Rond     karton    groen  707cm²
*/