package be.kdg.replace;

import java.util.Arrays;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

public class SortAndReplace {
    private String string;

    public SortAndReplace(String string) {
        this.string = string;
        verwerk();
    }

    private void verwerk() {
        string = string.replaceAll("\\d", ".");  // vervang alle digits door punten
        char[] chars = string.toCharArray();
        Arrays.sort(chars);                      // sorteer alle tekens lexografisch
        string = new String(chars);
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return string;
    }
}
