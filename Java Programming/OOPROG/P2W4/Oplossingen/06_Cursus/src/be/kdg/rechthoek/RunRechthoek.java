package be.kdg.rechthoek;

/**
 * @author Kristiaan Behiels
 * @version 1.1 25/11/13
 */
public class RunRechthoek {
    public static void main(String[] args) {
        try {
            Rechthoek nulRechthoek = new Rechthoek();
            System.out.println(nulRechthoek);

            Rechthoek rechthoek = new Rechthoek(10, 5);
            System.out.println(rechthoek);

            Rechthoek fouteRechthoek = new Rechthoek(10, -5);
            System.out.println(fouteRechthoek);
        }
        catch (IllegalArgumentException ex) {
            System.out.print("Fout bij creatie object: " + ex.getMessage());
        }
    }
}

/*
Breedte: 0  Hoogte: 0
Breedte: 10  Hoogte: 5
Fout bij creatie object: Negatieve hoogte
*/