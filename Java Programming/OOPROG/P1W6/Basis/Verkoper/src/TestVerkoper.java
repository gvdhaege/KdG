import java.util.Scanner;

public class TestVerkoper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de naam van de verkoper: ");
        String naam = scanner.nextLine();

        Verkoper verkoper = new Verkoper(naam);

        int[] verkoopCijfers = new int[12];

        for (int i = 0; i < verkoopCijfers.length; i++) {
            System.out.printf("Geef de verkoopcijfers voor maand %d: ", i + 1);
            verkoopCijfers[i] = scanner.nextInt();
        }

        verkoper.setVerkoopCijfers(verkoopCijfers);
        System.out.println(verkoper);
    }
}
