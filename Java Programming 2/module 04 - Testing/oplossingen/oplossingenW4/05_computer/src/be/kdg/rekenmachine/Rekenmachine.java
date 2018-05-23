package be.kdg.rekenmachine;

import be.kdg.rekenmachine.plugins.Plugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Rekenmachine {
    private static final Logger logger = Logger.getLogger("be.kdg.rekenmachine.Rekenmachine");

    private Plugin[] plugins = new Plugin[100];
    private int aantal;

    public void installeer(Plugin plugin) {
        plugins[aantal++] = plugin;
    }

    public void toonPlugins() {
        logger.log(Level.FINE, "Toon plugings");
        System.out.print("Plugins: ");
        for (int i = 0; i < aantal; i++) {
            System.out.print(plugins[i].getCommand() + " ");
        }
        System.out.println();
    }

    public double bereken(String operator, int x, int y) {
        logger.log(Level.INFO, "Berekening met {0} operator", operator);
        double resultaat = 0.0;
        for (int i = 0; i < aantal; i++) {
            if (plugins[i].getCommand().equals(operator)) {
                return plugins[i].bereken(x, y);
            }
        }
        return resultaat;
    }
}
