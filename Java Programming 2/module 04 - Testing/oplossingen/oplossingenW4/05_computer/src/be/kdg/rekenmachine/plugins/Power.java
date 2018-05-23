package be.kdg.rekenmachine.plugins;

public class Power implements Plugin {
    public String getCommand() {
        return "pow";
    }

    public double bereken(double x, double y) {
        return Math.pow(x, y);
    }
}
