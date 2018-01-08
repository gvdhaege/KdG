import java.util.Scanner;

public class SpellingDemo {
    private static final String[] TEST_WOORDEN = {"onmiddellijk", "ogenblikkelijk"};

    public static void main(String[] args) {
        boolean fout = true;
        do {
            System.out.print("Geef een synoniem voor 'direct' in 'o...k': ");
            Scanner scanner = new Scanner(System.in);
            String woord = scanner.nextLine();

            try {
                if (woord.equalsIgnoreCase(TEST_WOORDEN[0]) ||
                        woord.equalsIgnoreCase(TEST_WOORDEN[1])) {
                    System.out.println("Correct!");
                    fout = false;
                } else {
                    throw new SpellingException("o...k", woord);
                }
            } catch (SpellingException e) {
                System.out.println(e.getMessage());
            }
        } while (fout);
    }
}