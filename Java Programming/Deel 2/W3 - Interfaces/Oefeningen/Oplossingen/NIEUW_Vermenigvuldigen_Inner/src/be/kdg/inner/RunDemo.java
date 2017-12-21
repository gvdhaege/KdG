package be.kdg.inner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 23/11/2014 12:33
 */
public class RunDemo {
    public static void main(String[] args) {
        Vermenigvuldigbaar procuct = new Vermenigvuldigbaar() {
            @Override
            public int vermenigvuldig(int x, int y) {
                return x * y;
            }
        };

        System.out.println(procuct.vermenigvuldig(3, 5));
        System.out.println(procuct.kwadraat(4));
        System.out.println(procuct.derdeMacht(3));

    }
}
