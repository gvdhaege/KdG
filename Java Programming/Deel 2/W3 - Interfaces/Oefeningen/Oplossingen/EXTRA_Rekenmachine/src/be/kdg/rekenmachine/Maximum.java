package be.kdg.rekenmachine;

public class Maximum implements Plugin {
    public String getCommand() {
        return "max";  
    }

    public double bereken(double x, double y) {
        return x > y ? x : y;
    }
}
