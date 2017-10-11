import java.util.Scanner;

public class KlinkersDemo {
    public static void main(String[] args) {
        final String testWoord = "Gebruikershandleiding";
        String woord;
        Klinkers klinkers = new Klinkers(testWoord);
        klinkers.telKlinkers();
        System.out.println(klinkers.getWoord());
        System.out.println(klinkers.getA());
        System.out.println(klinkers.getE());
        System.out.println(klinkers.getI());
        System.out.println(klinkers.getO());
        System.out.println(klinkers.getU() + "\n");
        klinkers.reset();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Geef een woord in: ");
            woord = scanner.nextLine();
            if (!woord.isEmpty()){
                Klinkers nieuw = new Klinkers(woord);
                nieuw.telKlinkers();
                System.out.println(nieuw.getWoord());
                System.out.println(nieuw.getA());
                System.out.println(nieuw.getE());
                System.out.println(nieuw.getI());
                System.out.println(nieuw.getO());
                System.out.println(nieuw.getU() + "\n");
            }
        } while (!woord.isEmpty());


    }
}
