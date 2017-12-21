public class TestAbstractBord {
    public static void main(String[] args) {
        Bord rond = new RondBord("karton","groen",30);
        Bord vierkant = new VierkantBord("plastic", "wit", 20);

        System.out.printf("%-8s = %s %.0fcm²\n",
                "rond", rond, rond.oppervlakte());
        System.out.printf("%-8s = %s %.0fcm²\n",
                "vierkant", vierkant, vierkant.oppervlakte());
    }
}
