package Tafels;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 19:44
 */
public class Tafels {
    public static void main(String[] args) {

        for (int kolom = 0; kolom < 10; kolom++) {
            for (int rij = 0; rij < 10; rij++) {
                System.out.printf("%4d", (kolom + 1) * (rij + 1));
            }
            System.out.println();
        }
    }
}