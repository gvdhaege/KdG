import data.Artikel;

public class TestList {
    public static void main(String[] args) {
        MandjeList mandje = new MandjeList();
        mandje.voegToe(new Artikel("Druiven", 2.0));
        mandje.voegToe(new Artikel("Passievruchten", 2.35));
        mandje.voegToe(new Artikel("Mandarijnen", 2.50));
        mandje.voegToe(new Artikel("Pruimen", 2.49));
        mandje.voegToe(new Artikel("Druiven", 1.95));
        mandje.voegToe(new Artikel("Peren", 1.99));
        mandje.voegToe(new Artikel("Appels", 2.20));
        mandje.toon();
        System.out.println("\nGesorteerd volgens naam:");
        mandje.sorteerVolgensNaam();
        mandje.toon();
        System.out.println("\nGesorteerd volgens prijs:");
        mandje.sorteerVolgensPrijs();
        mandje.toon();
    }
}