import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final int MIN = 1;
    private static final int MAX = 10;
    private static boolean fout = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal = 1;
        do {
            try {
                System.out.print("Geef een getal van 1 tot en met 10: ");
                getal = scanner.nextInt();
                if (getal < MIN || getal > MAX) {
                    throw new InputMismatchException(getal + " is geen getal van 1 tot en met 10.");
                } else {
                    fout = false;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getLocalizedMessage());
            }
        } while (fout);
        System.out.println(getal + " is een goed getal!");
    }
}
