package be.kdg.rekenmachine.plugins;

public class Maximum implements Plugin {
    public String getCommand() {
        return "max";  
    }

    public double bereken(double x, double y) {
        return x > y ? x : y;
    }
}
