/**
 * Created by venj on 29/10/2014.
 */
import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik 2 getallen: ");
        int divisor = scanner.nextInt();
        int divident = scanner.nextInt();
        int resultOfDivision = divisor / divident;
        System.out.printf("%d / %d = %d", divisor, divident, resultOfDivision);
    }
}
