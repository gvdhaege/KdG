public class RunFase04 {
    public static void main(String[] args) {
        Vierkant vierkant = new Vierkant(2.0);
        System.out.println(vierkant);
        vierkant.herschaal(Herschaalbaar.KWART);
        System.out.println(vierkant);

        Rechthoek rechthoek = new Rechthoek(10.0, 5.0);
        System.out.println(rechthoek);
        rechthoek.herschaal(Herschaalbaar.HALF);
        System.out.println(rechthoek);

        Figuur figuur = new Vierkant(2.0);
        Berekenbaar berekenbaar = new Vierkant(2.0);
        Herschaalbaar herschaalbaar = new Vierkant(2.0);
    }
}
