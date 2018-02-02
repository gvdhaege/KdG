public class TestSet {
    public static void main(String[] args) {
        Mandje mandje = new Mandje();
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
        System.out.println("\nGesorteerd volgens prijs:");
        mandje.toonVolgensPrijs();
    }
}