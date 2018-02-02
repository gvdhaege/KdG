package be.kdg.commandline;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 *
 *
 * Command line parameters in te stellen via "Edit configurations" --> Program arguments:
 */
public class TaalKeuze {
    public static void main(String[] args) {
        if (args.length != 1) {
            error();
            return;
        }

        switch (args[0]) {
            case "/n":
                System.out.println("Dag wereld!");
                break;
            case "/e":
                System.out.println("Hello world");
                break;
            case "/f":
                System.out.println("Bonjour monde");
                break;
            case "/d":
                System.out.println("Hallo Welt");
                break;
            default: error();
        }
        // System.out.println(args[1]);
    }

    private static void error() {
        System.out.println("Use one of the following options:");
        System.out.println("\t/n -> Nederlands");
        System.out.println("\t/e -> English");
        System.out.println("\t/f -> Français");
        System.out.println("\t/d -> Deutsch");

    }
}
