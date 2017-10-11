import java.util.Scanner;

public class PersoonDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Geef je naam: ");
        String naam = keyboard.nextLine();
        System.out.print("Geef je leeftijd: ");
        int leeftijd = keyboard.nextInt();

        Persoon persoon = new Persoon(naam, leeftijd);
        System.out.println("Hallo " + persoon.getNaam() + ", je bent " + persoon.getLeeftijd());

        persoon.setLeeftijd(42);
        System.out.println("Hallo " + persoon.getNaam() + ", je bent " + persoon.getLeeftijd());

        persoon.setNaam("Janos");
        System.out.println("Hallo " + persoon.getNaam() + ", je bent " + persoon.getLeeftijd());
    }
}
