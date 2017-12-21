package be.kdg.minmax;

/**
 * De klasse Strings bevat slechts één attribuut, een List van String objecten.
 * Ze implementeert de MinMax-interface.
 */
public class Strings implements MinMax {
    private String[] strings = new String[100];
    private int aantal;

    /**
     * Methode om een String object aan de ArrayList toe te voegen.
     *
     * @param string De toe te voegen String.
     */
    public void add(String string) {
        strings[aantal++] = string;
    }

    /**
     * Methode die de alfabetisch kleinste string teruggeeft.
     *
     * @return String De alfabetisch kleinste string.
     */
    public String minimum() {
        String min = strings[0];
        for (int i = 1; i < aantal; i++) {
            String string = strings[i];
            if (string.compareTo(min) < 0) {
                min = string;
            }
        }
        return min;

    }

    /**
     * Methode die de alfabetisch grootste string teruggeeft.
     *
     * @return String De alfabetisch grootste string.
     */
    public String maximum() {
        String max = strings[0];
        for (int i = 1; i < aantal; i++) {
            String string = strings[i];
            if (string.compareTo(max) > 0) {
                max = string;
            }
        }
        return max;

    }

    /**
     * Methode die de inhoud van de strings op één regel
     * gescheiden door een spatie afdrukt.
     */
    public void toon() {
        for (int i = 0; i < aantal; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println("");
    }
}
