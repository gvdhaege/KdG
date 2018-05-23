package be.kdg.rekenmachine.plugins;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Optelling implements Plugin {
    private static final Logger logger = Logger.getLogger("be.kdg.rekenmachine.plugins.Optelling");

    public String getCommand() {
        logger.log(Level.FINE, "methode getCommand");
        return "+";
    }


    public double bereken(double x, double y) {
        return x + y;
    }
}
