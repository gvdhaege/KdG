import java.util.Scanner;

public class TestLettersNaarGetal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Geef een geheel getal in letters (max 18 cijfers)," +
                    "stop met <Enter>: ");
            input = scanner.nextLine();

            if (!input.isEmpty()) {
                System.out.println(LettersNaarGetal.zetOm(input));
            }
        } while (!input.isEmpty());
    }
}
