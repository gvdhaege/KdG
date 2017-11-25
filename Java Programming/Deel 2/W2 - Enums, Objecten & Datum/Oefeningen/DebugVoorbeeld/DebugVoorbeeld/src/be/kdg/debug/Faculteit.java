package be.kdg.debug;

public class Faculteit {
    public static long faculteit(int getal) {
        int result = 1;
        for (int i = 0; i < getal; i++) {
            result *= ++i;
        }
        return result;
    }
}
