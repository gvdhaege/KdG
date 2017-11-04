import java.util.Scanner;

public class SplitsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een zin in: ");
        String zin = scanner.nextLine();

        String[] woorden = zin.split("\\s+");
        System.out.printf("Aantal woorden: %d%n", woorden.length);
        for (String woord : woorden){
            System.out.println(woord);
        }
    }
}
