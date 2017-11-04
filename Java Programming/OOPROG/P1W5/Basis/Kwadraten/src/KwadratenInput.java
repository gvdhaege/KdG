import java.util.Scanner;

public class KwadratenInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hoeveel kwadraten wens je af te drukken? : ");

        int aantal = keyboard.nextInt();
        int[] getallen = new int[aantal];

        for (int i = 0; i < aantal; i++) {
            getallen[i] = (i + 1) * (i + 1);
        }

        for (int getal : getallen) {
            System.out.print(getal + " ");
        }
    }
}
