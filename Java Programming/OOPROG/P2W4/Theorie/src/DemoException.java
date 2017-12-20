import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef 2 getallen: ");
        int deeltal = 0;
        int deler = 0;
        try {
            deeltal = scanner.nextInt();
            deler = scanner.nextInt();
            int quotiënt = deeltal / deler;
            System.out.println(quotiënt);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.toString());
        } finally{
            System.out.println("Hallo hallo!");
        }
    }
}
