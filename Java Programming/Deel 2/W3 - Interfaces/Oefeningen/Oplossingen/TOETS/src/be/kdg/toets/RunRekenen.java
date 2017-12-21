package be.kdg.toets;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class RunRekenen {
    public static void main(String[] args) {
        Bewerkbaar machine = new Rekenen();
        machine.bewerk();
        System.out.println(machine);
        // machine.deel();
    }
}
