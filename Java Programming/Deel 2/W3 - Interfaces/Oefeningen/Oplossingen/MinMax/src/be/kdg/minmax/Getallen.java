package be.kdg.minmax;

/**
 * De klasse Getallen bevat slechts één attribuut, een List van Integer objecten.
 * Ze implementeert de MinMax-interface.
 */
public class Getallen implements MinMax {
    private int[] getallen = new int[100];
    private int aantal;


    /**
     * Methode om, vertrekkende van een int-waarde,
     * een overeenstemmend Integer object aan de ArrayList toe te voegen.
     *
     * @param getal Het toe te voegen getal.
     */
    public void add(int getal) {
        getallen[aantal++] = getal;
    }

    /**
     * Methode die de kleinste int-waarde in de ArrayList in de vorm van
     * een String teruggeeft.
     *
     * @return String De kleinste int-waarde.
     */
    public String minimum() {
        int min = getallen[0];
        for (int i = 1; i < aantal; i++) {
            int getal = getallen[i];
            if (getal < min) {
                min = getal;
            }
        }
        return Integer.toString(min);
    }

    /**
     * Methode die de grootste int-waarde in de ArrayList in de vorm van
     * een String teruggeeft.
     *
     * @return String De grootste int-waarde.
     */
    public String maximum() {
        int max = getallen[0];
        for (int i = 1; i < aantal; i++) {
            int getal = getallen[i];
            if (getal > max) {
                max = getal;
            }
        }
        return Integer.toString(max);
    }

    /**
     * Methode die de inhoud van de Arraylist (de getalwaarden) op één regel
     * gescheiden door een spatie afdrukt.
     */
    public void toon() {
        for (int i = 0; i < aantal; i++) {
            System.out.print(getallen[i] + " ");
        }
        System.out.println();
    }
}
