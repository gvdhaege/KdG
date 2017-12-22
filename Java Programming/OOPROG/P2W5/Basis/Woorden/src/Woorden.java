import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Woorden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een zin:\n");
        String zin = scanner.nextLine().toLowerCase();
        final String[] woorden = zin.split("[ ,.!?]");

        List<String> lijst1 = new ArrayList<>();
        for (String woord : woorden) {
            if (!woord.isEmpty()) {
                lijst1.add(woord);
            }
        }

        Random random = new Random();
        List<String> lijst2 = new ArrayList<>();

        while (lijst1.size() > 0) {
            int index = random.nextInt(lijst1.size());
            String randomWoord = lijst1.remove(index);
            lijst2.add(randomWoord);
        }

        for (int i = 0; i < lijst2.size(); i++) {
            String woord = lijst2.get(i);
            if (i == 0) {
                woord = woord.substring(0,1).toUpperCase() + woord.substring(1);
            }
            System.out.print(woord);

            if (i != lijst2.size() - 1){
                System.out.print(" ");
            } else {
                System.out.print(".");
            }
        }
    }
}
