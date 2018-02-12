package be.kdg.mastermind;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class Log {
    public static final boolean DEBUG_ON = true;
    public static void debug(String message){
        if (DEBUG_ON) System.out.println(message);
    }
}
