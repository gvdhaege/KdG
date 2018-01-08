package be.kdg.todo;

import java.util.Scanner;

/**
 * Created by venj on 29/11/2014.
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
        System.out.println("");
        System.out.println("TODOLIST:");
        System.out.println("*********");
        lijst.printAll();
        System.out.println("==> Menu:");
        System.out.println("1) item toevoegen");
        System.out.println("2) item op afgewerkt zetten");
        //HAAL ONDERSTAANDE LIJN CODE UIT COMMENTAAR VOOR UITBREIDING 2
        //System.out.println("3) afgewerkte items opkuisen");
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
            //case 3:
            //    lijst.verwijderAfgewerkteItems();
            //    break;
            case 9:
                return false;
            default:
                System.out.println("Oei, hier moet een Exception komen die zegt: De opties zijn: 1, 2 of 3...");
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

    }

    private void toonZetItemOpDoneMenu() {
        System.out.println("==> ZET EEN ITEM OP AFGEWERKT");
        lijst.printNietAfgewerkt();
        System.out.print("Welke item? ");

        int itemIndex = scanner.nextInt();
        scanner.nextLine();
        ////VUL VERDER AAN


    }
}
