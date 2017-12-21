import java.util.Random;

public class TestBord {
    private static final Random random = new Random();
    private static final int MAX_AANTAL = 10;

    public static void main(String[] args) {
        Bord[] borden = {
                new RondBord("karton", "groen",30),
                new VierkantBord("porcelijn", "wit",20),
                new RondBord("plastic","blauw",35),
                new VierkantBord("inox","zilver",25)
        };

        Bord[] lijst = new Bord[MAX_AANTAL];

        for (int i = 0; i < MAX_AANTAL ; i++) {
            lijst[i] = borden[random.nextInt(borden.length)];
        }

        for (Bord bord : lijst) {
            System.out.println(bord);
        }

    }
}
