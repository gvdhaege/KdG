import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Dagen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LocalDate vandaag = LocalDate.now();
        LocalDate geboortedatum = LocalDate.of(1983, 11, 21);
        long dagen = ChronoUnit.DAYS.between(geboortedatum, vandaag);

        System.out
                .print("Geef je geboortedatum in de vorm (dd mm jjjj): ");
        String datum = keyboard.nextLine();

        String vandaagString = vandaag.getDayOfMonth() + " ";
        vandaagString += vandaag.getMonth() + " ";
        vandaagString += vandaag.getYear();

        System.out.println("Vandaag is het " + vandaagString);
        System.out.print("Je leeft nu " + dagen + " dagen");


    }
}
