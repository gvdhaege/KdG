package be.steven.mastermind;

public class Log {
    public static final boolean DEBUG_MODE = false;

    public static void debug(String message) {
        if (DEBUG_MODE) {
            System.out.println(message);
        }
    }
}