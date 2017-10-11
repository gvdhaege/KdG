import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        boolean doorgaan = true;
        int getalWaarde = 0;

        Scanner scanner = new Scanner(System.in);
        StringBuilder getallen = new StringBuilder();

        System.out.print("Geef de maximale waarde in: ");
        if (scanner.hasNextInt()){
            int maximumWaarde = scanner.nextInt();
            System.out.printf("Geef de hoogste getalwaarde in (1..%d): ", maximumWaarde);
            getalWaarde = scanner.nextInt();
            if (getalWaarde < 1 || getalWaarde > maximumWaarde){
                System.out.printf("Foutieve waarde, dit is geen getal in de range 1..%d", maximumWaarde);
                doorgaan = false;
            }
        } else {
            System.out.println("Foutieve waarde, dit is geen getal!");
            doorgaan = false;
        }

        while (doorgaan) {
            for (int i = 1; i <= getalWaarde; i++) {
                getallen.append(i);
                getallen.append(' ');
            }
            System.out.println(getallen.toString());

            for (int i = 0; i < getallen.length(); i++) {
                if (getallen.charAt(i) == ' '){
                    getallen.deleteCharAt(i);
                }
            }
            System.out.println(getallen.toString());

            doorgaan = false;
        }
    }
}
