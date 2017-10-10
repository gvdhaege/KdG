import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 21:42
 */
public class Aangroei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doorgaan = true;
        double eindbedrag;

        while (doorgaan) {
            System.out.print("Geef het bedrag in € (stop met 0): ");
            double startbedrag = scanner.nextDouble();
            double cumulatiefbedrag = startbedrag;
            if (startbedrag == 0) {
                doorgaan = false;
            }
            System.out.print("Geef het aangroeipercentage in %: ");
            double aangroeiPercentage = scanner.nextDouble();
            System.out.print("Geef het aantal jaren: ");
            int aantalJaren = scanner.nextInt();

            for (int i = 0; i < aantalJaren; i++) {
                cumulatiefbedrag *= 1 + (aangroeiPercentage) / 100;
            }

            System.out.print("Bij een aangroei van "
                    + aangroeiPercentage
                    + "% heb je na "
                    + aantalJaren
                    + " jaren een bedrag van ");
            System.out.printf("%.0f", cumulatiefbedrag);
            System.out.print("€. \n");

            eindbedrag = startbedrag;
            aantalJaren = 0;
            while (eindbedrag < startbedrag * 2) {
                aantalJaren++;
                eindbedrag *= 1 + (aangroeiPercentage / 100);

            }
            System.out.println("Het duurt " + aantalJaren + " jaren om het bedrag te verdubbelen. \n");
        }

    }
}
