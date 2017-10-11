import java.util.Scanner;

public class Veelhoek {
    public static void main(String[] args) {
        Rechthoek rechthoek = new Rechthoek();
        RechthoekigeDriehoek rechthoekigeDriehoek = new RechthoekigeDriehoek();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Geef de breedte van de rechthoek: ");
        rechthoek.setBreedte(scanner.nextInt());
        System.out.print("Geef de hoogte van de rechthoek: ");
        rechthoek.setHoogte(scanner.nextInt());

        System.out.println("\nRechthoek");
        System.out.printf("Omtrek: %.1f", rechthoek.omtrek());
        System.out.printf("%nOppervlakte: %.1f%n%n", rechthoek.oppervlakte());

        System.out.print("Geef de basis van de driehoek: ");
        rechthoekigeDriehoek.setBasis(scanner.nextInt());
        System.out.print("Geef de hoogte van de driehoek: ");
        rechthoekigeDriehoek.setHoogte(scanner.nextInt());

        System.out.println("\nDriehoek");
        System.out.printf("Omtrek: %.1f", rechthoekigeDriehoek.omtrek());
        System.out.printf("%nOppervlakte: %.1f", rechthoekigeDriehoek.oppervlakte());

        System.out.printf("%n%nOverzicht: Rechthoek %dx%d\tDriehoek b%d h%d", rechthoek.getBreedte(), rechthoek.getHoogte(), rechthoekigeDriehoek.getBasis(), rechthoekigeDriehoek.getHoogte());

    }
}
