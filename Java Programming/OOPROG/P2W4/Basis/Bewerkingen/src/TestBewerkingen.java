import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBewerkingen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean invoerFout = true;

        do {
            try {
                int getalEen = scanner.nextInt();
                int getalTwee = scanner.nextInt();
                Bewerkingen bewerkingen = new Bewerkingen(getalEen, getalTwee);
                invoerFout = false;
                bewerkingen.doeBewerkingen();
                bewerkingen.toonResultaat();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Je moet 2 gehele getalen ingeven!");
            } catch (ArithmeticException e) {
                scanner.nextLine();
                System.out.println("Het tweede getal mag niet nul zijn.");
            }
        } while (invoerFout);
    }
}
