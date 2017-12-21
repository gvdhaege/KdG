package be.kdg.rekenmachine;

public class Deling implements Plugin {
    public String getCommand() {
        return "/";
    }

    public double bereken(double x, double y) {
        return x / y;
    }
}
