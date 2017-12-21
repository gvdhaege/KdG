package be.kdg.rekenmachine;

public class Minimum implements Plugin {
    public String getCommand() {
        return "min";  
    }

    public double bereken(double x, double y) {
        return x < y ? x : y;
    }
}
