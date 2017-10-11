import java.util.Scanner;

public class StringsVergelijken2 {
    public static void main(String[] args) {
        String stringEen;
        String stringTwee;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de eerste string: ");
        stringEen = scanner.nextLine();
        System.out.print("Geef de tweede string: ");
        stringTwee = scanner.nextLine();

        System.out.printf("%s %s ", stringEen.trim(), stringTwee.trim());

    }
}
