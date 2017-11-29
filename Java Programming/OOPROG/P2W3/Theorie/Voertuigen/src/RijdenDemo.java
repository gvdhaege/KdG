public class RijdenDemo {
    public static void main(String[] args) {
        Fiets fiets = new Fiets("TringTring");
        Auto auto = new Auto("Opel","Astra");
        Speelgoedtrein trein = new Speelgoedtrein("Lego");

        System.out.println(fiets.start());
        System.out.println(fiets.stop());
        System.out.println(auto.start());
        System.out.println(auto.stop());
        System.out.println(trein.start());
        System.out.println(trein.stop());
    }
}
