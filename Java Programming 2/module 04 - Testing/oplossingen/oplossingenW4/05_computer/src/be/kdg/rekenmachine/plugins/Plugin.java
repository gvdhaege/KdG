package be.kdg.rekenmachine.plugins;

public interface Plugin {
    String getCommand();
    double bereken(double x, double y);
}
