import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Dagen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LocalDate vandaag = LocalDate.now();

        System.out.print("Geef je geboortedatum in de vorm (dd mm jjjj): ");
        String datum = keyboard.nextLine();

        int dag = Integer.parseInt(datum.substring(0,2));
        int maand = Integer.parseInt(datum.substring(3,5));
        int jaar = Integer.parseInt(datum.substring(6,10));

        LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);
        long dagen = ChronoUnit.DAYS.between(geboortedatum, vandaag);

        String vandaagString = vandaag.getDayOfMonth() + " ";
        vandaagString += vandaag.getMonth() + " ";
        vandaagString += vandaag.getYear();

        System.out.println("Vandaag is het " + vandaagString);
        System.out.print("Je leeft nu " + dagen + " dagen");
    }
}
