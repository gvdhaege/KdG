package be.kdg.todo;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * User: vochtenh
 * Date: 2-12-13 16:51
 * User: venjoha
 * Date: 29-11-14 (review and adjustments for AJ1415)
 */
public class Wunderlist {
    public static void main(String[] args) {
        new Wunderlist();
    }

    private TodoLijst lijst;
    private Scanner scanner = new Scanner(System.in);

    public Wunderlist() {
        lijst = new TodoLijst();
        boolean run = true;
        while (run) run = toonMenu();
    }

    private boolean toonMenu() {
        try { //TRY UIT OPGAVE HALEN
            System.out.println("");
            System.out.println("TODOLIST:");
            System.out.println("*********");
            lijst.printAll();
            System.out.println("==> Menu:");
            System.out.println("1) item toevoegen");
            System.out.println("2) item op afgewerkt zetten");
            //HAAL ONDERSTAANDE LIJN CODE UIT COMMENTAAR VOOR UITBREIDING 2
            System.out.println("3) afgewerkte items opkuisen");
            System.out.println("9) verlaten");
            System.out.print("Geef je keuze: ");
            int keuze = scanner.nextInt();
            scanner.nextLine();
            switch (keuze) {
                case 1:
                    toonVoegItemToeMenu();
                    break;
                case 2:
                    toonZetItemOpDoneMenu();
                    break;
                //HAAL ONDERSTAANDE CODE UIT COMMENTAAR VOOR UITBREIDING 2
                case 3:
                    lijst.verwijderAfgewerkteItems();
                    break;
                case 9:
                    return false;
                default:
                    throw new InputMismatchException("De opties zijn: 1, 2 of 3...");
            }
            //ONDERSTAANDE LIJNEN CODE UIT OPGAVE HALEN tot aan return true (die lijn moet blijven);
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Dat was foute input!");
            if (e.getMessage() != null) {
                System.out.println(e.getMessage());
            }
            scanner.nextLine();
        }
        return true;
    }

    private void toonVoegItemToeMenu() {
        System.out.println("==> VOEG EEN ITEM TOE");
        System.out.print("Geef de titel: ");
        String titel = scanner.nextLine();
        System.out.println("Geef nu de deadline in voor het item:");
        System.out.print(" Geef de dag: ");
        int dag = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Geef de maand: ");
        int maand = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Geef het jaar: ");
        int jaar = scanner.nextInt();
        scanner.nextLine();
        //VUL AAN VANAF HIER...
        //VANANF HIER UIT OPGAVE HALEN
        LocalDate deadline = LocalDate.of(jaar, maand, dag);
        try {
            lijst.add(titel, deadline);
            System.out.println("Het item is toegevoegd!");
        } catch (TodoLijstException | IllegalArgumentException e) {
            System.out.println("Het item is niet toegevoegd:\n" + e.getMessage());
        }
    }

    private void toonZetItemOpDoneMenu() {
        System.out.println("==> ZET EEN ITEM OP AFGEWERKT");
        lijst.printNietAfgewerkt();
        System.out.print("Welke item? ");
        //TRY CATCH UIT OPGAVE HALEN
        try {
            int itemIndex = scanner.nextInt();
            scanner.nextLine();
            ////VUL VERDER AAN
            lijst.zetOpAfgewerkt(itemIndex - 1); //LIJN UIT OPGAVE HALEN
        } catch (TodoLijstException e) {
            System.out.println("Kan het item niet op afgewerkt zetten: " + e.getMessage());
        }
    }
}
