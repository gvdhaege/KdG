import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een woord in: ");
        String woord = scanner.nextLine();
        StringBuilder palindroom = new StringBuilder(woord);
        String palindroomCheck = palindroom.reverse().toString();

        if (woord.equalsIgnoreCase(palindroomCheck)){
            System.out.printf("Het woord %s is een palindroom", woord);
        } else {
            System.out.printf("Het woord %s is niet palindroom", woord);
        }

    }
}
