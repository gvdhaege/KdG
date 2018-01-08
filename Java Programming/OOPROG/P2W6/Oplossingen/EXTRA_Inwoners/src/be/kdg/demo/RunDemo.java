package be.kdg.demo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 13/12/13
 */
public class RunDemo {
    public static void main(String[] args) {
        Inwoners inwoners = new Inwoners();

        // Volgens id
        System.out.println(inwoners);
        System.out.println();

        // Volgens postnummer
        System.out.println(inwoners.volgensPostnummer());

    }
}
