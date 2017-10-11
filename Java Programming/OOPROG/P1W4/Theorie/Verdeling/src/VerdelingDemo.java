import java.util.Random;

public class VerdelingDemo {
    public static void main(String[] args) {

        final int AANTAL = 100;
        Random random = new Random();
        Verdeling verdeling = new Verdeling();

        for (int i = 0; i <= 4; i++) {
            if(i > 0){
                System.out.println("Verdeling:");
                System.out.println(verdeling.toonVerdeling());
                System.out.printf("Gemiddelde: %.2f %n %n",verdeling.gemiddeldeWaarde());
            }
            for (int j = 0; j < AANTAL; j++) {
                int willekeurigGetal = random.nextInt(6) + 1;
                verdeling.voegWaardeToe(willekeurigGetal);
            }
        }
    }
}
