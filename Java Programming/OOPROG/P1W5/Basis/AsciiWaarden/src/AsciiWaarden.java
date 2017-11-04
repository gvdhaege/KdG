import java.util.Scanner;

public class AsciiWaarden {
    public static void main(String[] args) {
        boolean keepGoing = true;

        Scanner scanner = new Scanner(System.in);

        while (keepGoing) {
            System.out.print("Geef een woord in (stop met <ENTER>: ");
            String woord = scanner.nextLine();
            int lengte = woord.length();

            if (lengte == 0) {
                keepGoing = false;
            }
            for (int i = 0; i < lengte; i++) {
                int[] asciiWaarden = new int[lengte];
                asciiWaarden[i] = (int) woord.charAt(i);
                System.out.print(asciiWaarden[i] + " ");
            }
            System.out.println();
        }
    }
}
