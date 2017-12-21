import java.util.Scanner;

/**
 * Created by venj on 29/10/2014.
 */
public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik 2 getallen: ");
        try {
            int divisor = scanner.nextInt();
            int divident = scanner.nextInt();
            int resultOfDivision = divisor / divident;
            System.out.printf("%d / %d = %d", divisor, divident, resultOfDivision);
        }catch (Throwable ex){
            System.out.println(ex.getMessage());
            System.out.println("StackTrace");
            ex.printStackTrace();
            System.out.println("ToString");
            System.out.println(ex.toString());
        }
    }
}
