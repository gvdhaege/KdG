

public class RunFase05 {
    public static void main(String[] args) {
        Herschaalbaar[] figuren = {
                new Vierkant(2.0),
                new Rechthoek(10.0,5.0),
                new Vierkant(4.0)
        };

        for (Herschaalbaar figuur : figuren){
            figuur.herschaal(Schalen.DUBBEL);
            figuur.herschaal(Schalen.KWART);
            System.out.println(figuur);
        }
        System.out.println();
    }
}
