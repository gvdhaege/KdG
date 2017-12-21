package be.kdg.rekenmachine;

import java.util.ArrayList;
import java.util.List;

public class Rekenmachine {
    private Plugin[] plugins = new Plugin[100];
    private int aantal;

    public void installeer(Plugin plugin) {
        plugins[aantal++] = plugin;
    }

    public void toonPlugins() {
        System.out.print("Plugins: ");
        for (int i = 0; i < aantal; i++) {
            System.out.print(plugins[i].getCommand() + " ");
        }
        System.out.println();
    }

    public double bereken(String operator, int x, int y) {
        double resultaat = 0.0;
        for (int i = 0; i < aantal; i++) {
            if (plugins[i].getCommand().equals(operator)) {
                return plugins[i].bereken(x, y);
            }
        }
        return resultaat;
    }
}
