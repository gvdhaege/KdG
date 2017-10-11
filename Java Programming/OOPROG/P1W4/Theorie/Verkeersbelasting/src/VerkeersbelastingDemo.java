import java.util.Scanner;

public class VerkeersbelastingDemo {
    public static void main(String[] args) {
        String merk;


        System.out.println("Voer telkens merk, type en fiscaal vermogen in.");
        System.out.println("Stop door voor het merk onmiddellijk <Enter> te geven.");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%nGeef het merk: ");
            merk = scanner.nextLine();
            if (!merk.isEmpty()){
                System.out.print("Geef het type: ");
                String type = scanner.nextLine();
                System.out.print("Geef het fiscaal vermogen: ");
                int vermogen = scanner.nextInt();
                Auto auto = new Auto(merk, type, vermogen);
                if (vermogen < 3){
                    System.out.println("De verkeersbelasting kan niet bepaald worden.");
                } else {
                    System.out.printf("%nVoor een %s %s met %dpk betaal je \u20AC%.2f%n", auto.getMerk(), auto.getType(), auto.getFiscaalVermogen(), auto.berekenVerkeersbelasting());
                }
            }
        } while(!merk.isEmpty());
    }
}
