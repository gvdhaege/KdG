import java.util.Random;
import java.util.Scanner;

public class SpeelKaarten {
    public static void main(String[] args) {
        String[] kleuren = {
                "Harten", "Schoppen", "Ruiten", "Klaveren"
        };
        String[] waarden = {
                "Aas", "Twee", "Drie", "Vier", "Vijf",
                "Zes", "Zeven", "Acht", "Negen", "Tien",
                "Boer", "Dame", "Heer"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Hoeveel kaarten wens je (1..5): ");
        if (scanner.hasNextInt()) {
            int aantalKaarten = scanner.nextInt();
            if (aantalKaarten > 0 && aantalKaarten < 6) {
                for (int i = 0; i < aantalKaarten; i++) {
                    System.out.println(kleuren[random.nextInt(4)] + " " + waarden[random.nextInt(12)]);
                }
            } else {
                System.out.println("Dit is geen geldige waarde!");
            }

        } else {
            System.out.println("Dit is geen geldige waarde!");
        }




    }
}