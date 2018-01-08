import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by venj on 29/10/2014.
 */
public class Opdracht4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik 2 getallen: ");
        try {
            int divisor = scanner.nextInt();
            int divident = scanner.nextInt();
            int result = divisor / divident;
            System.out.printf("%d / %d = %d", divisor, divident, result);
        }catch (ArithmeticException | InputMismatchException ex){
            System.out.println(ex.toString());
        }
    }
}
