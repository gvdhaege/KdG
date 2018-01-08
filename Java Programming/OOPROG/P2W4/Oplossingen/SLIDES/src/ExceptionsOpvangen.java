/**
 * Created by venj on 29/10/2014.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsOpvangen {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Tik 2 getallen: ");
    try {
        int divisor = scanner.nextInt();
        int divident = scanner.nextInt();
        int resultOfDivision = divisor / divident;
        System.out.printf("%d / %d = %d", divisor, divident, resultOfDivision);
    }catch (RuntimeException ex){
        System.out.println(ex.toString());
    }
}

    public static void oldMain(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik 2 getallen: ");
        try {
            int divisor = scanner.nextInt();
            int divident = scanner.nextInt();
            int resultOfDivision = divisor / divident;
            System.out.printf("%d / %d = %d", divisor, divident, resultOfDivision);
        }
        catch (InputMismatchException ex) {
            System.out.println("Foutieve invoer!");
        }
    }
}
