package be.kdg.rechthoek;

/**
 * @author Kristiaan Behiels
 * @version 1.0 3-12-13
 */
public class RunRechthoek {
    public static void main(String[] args)  {
        try {
            Rechthoek defaultRechthoek = new Rechthoek();
            Rechthoek rechthoek = new Rechthoek(10, 5);
            Rechthoek breedteFout = new Rechthoek(-10, 5); // geeft exception
            Rechthoek hoogteFout = new Rechthoek(10, -5); // deze regel wordt niet uitgevoerd

            System.out.println(defaultRechthoek);
            System.out.println(rechthoek);
            System.out.println(breedteFout);
            System.out.println(hoogteFout);

        } catch (NegativeSizeException ex) {
            System.out.println(ex.getMessage());
        }
        // hier verder
    }
}
