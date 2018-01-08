public class TestGemiddelde {
    public static void main(String[] args) {
        double[] tabel = new double[] { 1.2, 2.1, 3.2, 4.3 };
        double[] tabelLeeg = {}; berekenGemiddelde(tabel);
        berekenGemiddelde(tabelLeeg);
    }
    private static void berekenGemiddelde(double[] tabel) {
        Gemiddelde gemiddelde = new Gemiddelde();
        System.out.println("Het gemiddelde is: " +
                gemiddelde.getGemiddelde(tabel));
    }
}