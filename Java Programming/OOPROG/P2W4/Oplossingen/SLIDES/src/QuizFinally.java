import java.util.Scanner;

/**
 * Created by venj on 29/10/2014.
 */
public class QuizFinally {
    public static void main(String[] args) {
        //case1();
        System.out.println();
        //case2();
        System.out.println();
        //case3();
        System.out.println();
        case4();
    }

    private static void case1() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tik een getal: ");
        i = scanner.nextInt();

        try {
            i = 5 / i;
            i += 54;
        } catch (ArithmeticException ex) {
            i = 100;
        }
        System.out.printf("i = %d", i);
    }

    private static void case2() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tik een getal: ");
        i = scanner.nextInt();

        try {
            i = 5 / i;
            i += 54;
        } catch (ArithmeticException ex) {
            i = 100;
        } finally {
            i = 5;
        }
        System.out.printf("i = %d", i);
    }

    private static void case3() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tik een getal: ");
        i = scanner.nextInt();

        try {
            i = 5 / i;
            i += 54;
        } catch (ArithmeticException ex) {
            i = 100;
        } catch (RuntimeException ex) {
            i = 200;
        }
        System.out.printf("i = %d", i);
    }

    private static void case4() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tik een getal: ");

        try {
            i = scanner.nextInt();
            i = 5 / i;
            i += 54;
        } catch (ArithmeticException ex) {
            i = 100;
        } catch (RuntimeException ex) {
            i = 200;
        }
        System.out.printf("i = %d", i);
    }
}
