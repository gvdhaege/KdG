package be.kdg.interfacedemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 23/11/2014 12:33
 */
public class RunDemo {
    public static void main(String[] args) {
        Procuct procuct = new Procuct();

        System.out.println(procuct.vermenigvuldig(3, 5));
        System.out.println(procuct.kwadraat(4));
        System.out.println(procuct.derdeMacht(3));

    }
}
