package be.kdg.rekenmachine.plugins;

public class Aftrekking implements Plugin {
    public String getCommand() {
        return "-";
    }

    public double bereken(double x, double y) {
        return x - y;
    }
}
