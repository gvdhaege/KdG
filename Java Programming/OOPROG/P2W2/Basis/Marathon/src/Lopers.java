import java.util.Arrays;

public class Lopers {
    private static int aantal;
    private Loper[] lopers;

    public Lopers(int aantal) {
        this.lopers = new Loper[aantal];
    }

    public void voegLoperToe(Loper loper) {
        lopers[aantal++] = loper;
    }

    public static int aantalLopers() {
        return aantal;
    }

    public Loper[] getLopers() {
        return lopers;
    }

    public void sorteerVolgensTijd() {
        Arrays.sort(lopers);
    }
}
